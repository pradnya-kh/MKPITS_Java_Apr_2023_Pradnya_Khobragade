package com.example.Theamleaf_FirstProject.controller;

import com.example.Theamleaf_FirstProject.Service.StudentServiceimp;
import com.example.Theamleaf_FirstProject.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProcessForm {
    private StudentServiceimp studentServiceimp;
@Autowired
    public ProcessForm(StudentServiceimp studentServiceimp) {
        this.studentServiceimp = studentServiceimp;
    }

    @GetMapping("/show")
    public String dispalyStudentList(Model model){
    List<Student> list=studentServiceimp.display();
    model.addAttribute("studentlist",list);
    return"display";
    }

    @GetMapping("/register")
    public String showform(Model model){
    Student student=new Student();
    model.addAttribute("student",student);
    return "form";
    }

  @PostMapping("/process")
   public String save(@ModelAttribute("student")Student studentData){
    studentServiceimp.insertRecord(studentData);
        return "redirect:/show";

    }
}
