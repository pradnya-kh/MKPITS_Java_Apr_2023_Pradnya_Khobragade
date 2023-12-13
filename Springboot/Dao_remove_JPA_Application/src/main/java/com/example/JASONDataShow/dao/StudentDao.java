package com.example.JASONDataShow.dao;

import com.example.JASONDataShow.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student,Integer> {
}

