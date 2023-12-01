package com.example.JASONDataShow.services;

import com.example.JASONDataShow.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();

    String save(Student student);

    Student updateRecord(Student student);

    public  void deleteRecord(Integer rollno);

}
