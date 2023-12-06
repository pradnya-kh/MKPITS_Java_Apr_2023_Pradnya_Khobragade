package com.example.Theamleaf_FirstProject.Controller;

import com.example.Theamleaf_FirstProject.entity.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProcessForm {
    @GetMapping("/Showform")
    public String myform(Model model){
        Student student=new Student();
        model.addAttribute("stud",student);
        return "form";
    }


    @PostMapping("/process")
    public String Process(@ModelAttribute("stud")Student studentData){
        return "display";
    }

}
