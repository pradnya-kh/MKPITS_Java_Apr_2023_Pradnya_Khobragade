package com.example.Theamleaf_FirstProject.Controller;

import com.example.Theamleaf_FirstProject.entity.Student;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ProcessForm {
    @GetMapping("/Showform")
    public String myform(Model model){
        Student student=new Student();
        model.addAttribute("stud",student);
        return "form";
    }


    @GetMapping("/process")
    public String Process(@Valid @ModelAttribute("stud")Student studentData, BindingResult theBindingResult) {

        if (theBindingResult.hasErrors()) {
            return "form";
        } else {
            return "display";
        }

    }
}
