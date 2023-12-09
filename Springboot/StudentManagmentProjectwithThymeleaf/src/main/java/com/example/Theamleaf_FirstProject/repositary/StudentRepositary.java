package com.example.Theamleaf_FirstProject.repositary;

import com.example.Theamleaf_FirstProject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositary extends JpaRepository<Student,Integer> {
}
