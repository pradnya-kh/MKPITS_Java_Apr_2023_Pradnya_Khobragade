package com.example.JASONDataShow.rest;

import com.example.JASONDataShow.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student,Integer> {
}

