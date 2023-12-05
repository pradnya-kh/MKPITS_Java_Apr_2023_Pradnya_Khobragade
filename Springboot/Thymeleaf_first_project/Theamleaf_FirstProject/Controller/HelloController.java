package com.example.Theamleaf_FirstProject.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/form")
    public String getOutput(){
        ///model.addAttribute("hllo" ,"Pradnya");
        return "hello";
    }



}
