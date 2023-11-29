package com.example.SQLConnectivity.dao;

import com.example.SQLConnectivity.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOlmpl implements StudentDAO{
    private EntityManager entityManager;
    @Autowired
    public  StudentDAOlmpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }
@Override
    @Transactional
    public void save(Student student){
        entityManager.persist(student);
}
public Student findrollno(Integer rollno){
        return entityManager.find(Student.class,rollno);
}
}
