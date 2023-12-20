package com.example.SpringBootAdvanceMapping.repository;

import com.example.SpringBootAdvanceMapping.entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe,Integer> {
}
