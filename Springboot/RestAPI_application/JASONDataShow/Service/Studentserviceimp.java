package com.example.JASONDataShow.Service;

import com.example.JASONDataShow.entity.Student;
import com.example.JASONDataShow.rest.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Studentserviceimp implements StudentService{
    private StudentDao studentDao;
@Autowired
    public Studentserviceimp(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public Student find(Integer rollno) {
    Optional<Student> studentOptional=studentDao.findById(rollno);
        return studentOptional.get();
    }
}
