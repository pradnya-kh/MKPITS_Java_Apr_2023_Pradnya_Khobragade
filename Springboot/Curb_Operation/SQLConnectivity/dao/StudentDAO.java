package com.example.SQLConnectivity.dao;

import com.example.SQLConnectivity.entity.Student;

import java.util.List;

public interface StudentDAO {
    public void save(Student student);

    Student findrollno(Integer rollno);

    public  void deleteRecord(Integer rollno);

    Student updateRecord(Student student);

List<Student> findAll();

}
