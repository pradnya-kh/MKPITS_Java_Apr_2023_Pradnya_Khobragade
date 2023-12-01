package com.example.JASONDataShow.rest;

import com.example.JASONDataShow.entity.Student;
import com.example.JASONDataShow.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentRestController {
    private StudentService studentService;
    @Autowired

    public StudentRestController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/students")
     public List<Student> getstudentlist(){
        return studentService.findAll();
    }
    @PostMapping("/students1")
    public String saveStudent(@RequestBody Student student){
        return studentService.save(student);
    }

    @PutMapping("/students2")
    public Student updatedata(@RequestBody Student student){
        return studentService.updateRecord(student);
    }

    @DeleteMapping("/student3/{rollno}")
    public void  deleterecord(@PathVariable int rollno){
        studentService.deleteRecord(rollno);
        System.out.println("data deleted");
    }


}
