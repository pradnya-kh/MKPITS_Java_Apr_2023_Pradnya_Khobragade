package com.example.Theamleaf_FirstProject.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProcessForm {
    @GetMapping("/process")
    public String Process(HttpServletRequest httprequest, Model model){
        String rollno = httprequest.getParameter("rollno");
        String name= httprequest.getParameter("name");
        String address=httprequest.getParameter("address");
        String city=httprequest.getParameter("city");
        model.addAttribute("rollno",rollno);
        model.addAttribute("name",name);
        model.addAttribute("address",address);
        model.addAttribute("city",city);
        return "display";
    }

}
