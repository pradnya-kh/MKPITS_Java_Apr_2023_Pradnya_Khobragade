package com.example.JASONDataShow.controller;

import com.example.JASONDataShow.Service.StudentService;
import com.example.JASONDataShow.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stud")
public class StudentController {
    private StudentService studentService;
@Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/stud1")
    public Student getRollNO(Integer rollno){
        return studentService.find(rollno);


    }

}
