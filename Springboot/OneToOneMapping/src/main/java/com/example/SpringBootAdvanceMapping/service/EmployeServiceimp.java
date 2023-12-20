package com.example.SpringBootAdvanceMapping.service;

import com.example.SpringBootAdvanceMapping.entity.Employe;
import com.example.SpringBootAdvanceMapping.repository.EmployeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class EmployeServiceimp  implements EmployeService{
    private  EmployeRepository employeRepository;
@Autowired
    public EmployeServiceimp(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }
//--------------for insert data----------
    @Override
    @Transactional
    public String save(Employe employe) {
    employeRepository.save(employe);
        return "data insert";
    }
//-------------For Display---------------
    @Override
    public List<Employe> display(Employe employe) {
        return employeRepository.findAll();
    }


//--------------------update--------------
   @Override
    @Transactional
    public Employe update(Employe employe) {
    Optional<Employe> optionalEmploye= employeRepository.findById(employe.getEmploye_id());
    if(optionalEmploye.isPresent()) {
        employeRepository.save(employe);
    }else {
        System.out.println("Data not fetch");
    }
    return employe;


    }
//--------------------------DeleteRecord-----------------------
    @Override
    @Transactional
    public void DeleteRecord(Employe employe) {
    employeRepository.deleteById(employe.getEmploye_id());



    }


}
