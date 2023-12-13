package com.example.JASONDataShow.controller;

import com.example.JASONDataShow.Service.StudentService;
import com.example.JASONDataShow.entity.Student;
import com.example.JASONDataShow.execeptionhandling.Errordetails;
import com.example.JASONDataShow.execeptionhandling.RecordNotFoundExcption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stud")
public class StudentController {
    private StudentService studentService;
@Autowired
    public StudentController(StudentService studentService) {

    this.studentService = studentService;
    }
    @GetMapping("/stud1/{rollno}")
    public Student getRollNO(@PathVariable Integer rollno){
        return studentService.find(rollno);


    }
    @PostMapping ("/insert")
    public String insertStudent(@RequestBody Student student){
        return studentService.insertRecord(student);
    }

    @PostMapping("/update")
    public String UpdateRecord(@RequestBody Student student){
    return studentService.UpdateRecord(student);
    }

    @ExceptionHandler
    public ResponseEntity<Errordetails>handlerror(RecordNotFoundExcption recordNotFoundExcption){
    Errordetails errordetails=new Errordetails();
    errordetails.setStatus(HttpStatus.NOT_FOUND.value());
    errordetails.setMessage(recordNotFoundExcption.getMessage());
    errordetails.setTimestamp(System.currentTimeMillis());
    return new ResponseEntity<>(errordetails,HttpStatus.NOT_FOUND);


    }

}
