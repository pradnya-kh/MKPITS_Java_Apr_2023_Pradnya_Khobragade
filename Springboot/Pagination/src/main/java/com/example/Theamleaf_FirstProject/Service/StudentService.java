package com.example.Theamleaf_FirstProject.Service;

import com.example.Theamleaf_FirstProject.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StudentService {

    public List<Student> display();
    public String insertRecord(Student student);
    Student UpdateRecord(Integer rollno);

    void DeleteRecord(Integer rollno);
    Page<Student>getpage(Pageable pageable);






}
