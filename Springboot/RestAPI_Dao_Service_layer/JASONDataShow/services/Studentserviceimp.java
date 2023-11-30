package com.example.JASONDataShow.services;

import com.example.JASONDataShow.Dao.StudentDao;
import com.example.JASONDataShow.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Studentserviceimp implements StudentService{
    private StudentDao studentDao;
    @Autowired

    public Studentserviceimp(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll() ;
    }
}
