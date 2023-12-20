package com.example.SpringBootAdvanceMapping.service;

import com.example.SpringBootAdvanceMapping.entity.Employe;

import java.util.List;

public interface EmployeService {
    public String save(Employe employe);

    public List<Employe> display(Employe employe);

     Employe update (Employe employe);

     void DeleteRecord(Employe employe);


}
