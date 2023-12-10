package com.example.Theamleaf_FirstProject.Service;

import com.example.Theamleaf_FirstProject.repositary.StudentRepositary;
import com.example.Theamleaf_FirstProject.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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



   @Override
   @Transactional
    public Student UpdateRecord(Integer rollno) {
        Student student1 = studentRepositary.findById(rollno).get();
        return student1;
   }

    @Override
    public void DeleteRecord(Integer rollno) {
        Student student=studentRepositary.findById(rollno).get();
        studentRepositary.delete(student);

    }

    @Override
    public Page<Student> getpage(Pageable pageable) {

        return studentRepositary.findAll(pageable);
    }


}
