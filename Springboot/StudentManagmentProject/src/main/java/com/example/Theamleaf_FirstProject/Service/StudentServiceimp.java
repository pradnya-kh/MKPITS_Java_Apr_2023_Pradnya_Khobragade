package com.example.Theamleaf_FirstProject.Service;

import com.example.Theamleaf_FirstProject.repositary.StudentRepositary;
import com.example.Theamleaf_FirstProject.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceimp implements StudentService{
    private StudentRepositary studentRepositary;

    @Autowired
    public StudentServiceimp(StudentRepositary studentRepositary) {
        this.studentRepositary = studentRepositary;
    }
    @Override
    public List<Student> display() {
        return studentRepositary.findAll();
    }

    @Override
    @Transactional
    public String insertRecord(Student student) {
        studentRepositary.save(student);
        return "Insert Data";


    }
}
