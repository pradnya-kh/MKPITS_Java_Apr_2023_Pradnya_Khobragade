package com.example.SpringBootAdvanceMapping.controller;

import com.example.SpringBootAdvanceMapping.entity.Employe;
import com.example.SpringBootAdvanceMapping.service.EmployeServiceimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeController {
     private EmployeServiceimp employeServiceimp;
@Autowired
    public EmployeController(EmployeServiceimp employeServiceimp) {
        this.employeServiceimp = employeServiceimp;
    }
@GetMapping("/insertdata")
    public String save(@RequestBody Employe employe ){
     return employeServiceimp.save(employe);
}
@GetMapping("/find")
    List<Employe>findAll(Employe employe){
    return employeServiceimp.display(employe);

    }
    @GetMapping("/update")
    public Employe update(@RequestBody Employe employe){
    return employeServiceimp.update(employe);

    }

}