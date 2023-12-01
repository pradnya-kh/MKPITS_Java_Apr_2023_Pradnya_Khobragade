package com.example.JASONDataShow.Dao;

import com.example.JASONDataShow.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAll();

    String save(Student student);

    Student updateRecord(Student student);

    public  void deleteRecord(Integer rollno);




}
