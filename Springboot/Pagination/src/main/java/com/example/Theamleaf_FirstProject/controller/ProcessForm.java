package com.example.Theamleaf_FirstProject.controller;

import com.example.Theamleaf_FirstProject.Service.StudentServiceimp;
import com.example.Theamleaf_FirstProject.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    return "form1";
    }

  @PostMapping("/process")
   public String save(@ModelAttribute("student")Student studentData){
    studentServiceimp.insertRecord(studentData);
        return "redirect:/show";

    }
  @GetMapping("/update")
   public String updateStudent(@RequestParam ("rollno")int rn, Model model){
    Student student=studentServiceimp.UpdateRecord(rn);
    model.addAttribute("student",student);
        return "form1";
    }

    @GetMapping("/deleterecord")
    public String deleterecord(@RequestParam("rollno")int rn){
    studentServiceimp.DeleteRecord(rn);
    return "redirect:/show";
    }

    @GetMapping("/pagging")
    public String displaypage(@PageableDefault(size =5) Pageable pageable, Model model){
        Page<Student>page=studentServiceimp.getpage(pageable);
        model.addAttribute("student",page);
        return "pagination";


    }
}
