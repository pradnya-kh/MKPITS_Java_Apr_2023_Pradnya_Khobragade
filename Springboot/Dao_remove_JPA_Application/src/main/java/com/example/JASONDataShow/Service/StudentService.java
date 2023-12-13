package com.example.JASONDataShow.Service;

import com.example.JASONDataShow.entity.Student;

public interface StudentService {
    public Student find(Integer rollno);
    String insertRecord(Student student);
    String UpdateRecord(Student student);


}
