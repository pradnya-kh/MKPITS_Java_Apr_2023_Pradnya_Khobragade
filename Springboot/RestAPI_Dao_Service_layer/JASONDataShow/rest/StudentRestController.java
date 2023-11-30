package com.example.JASONDataShow.rest;

import com.example.JASONDataShow.entity.Student;
import com.example.JASONDataShow.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentRestController {
    private StudentService studentService;
    @Autowired

    public StudentRestController(StudentService studentService) {
        this.studentService = studentService;
    }
@GetMapping("/student")
public List<Student> getstudentlist(){
return studentService.findAll();


    }

}
