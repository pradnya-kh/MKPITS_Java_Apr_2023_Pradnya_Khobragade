package com.example.JASONDataShow.Dao;

import com.example.JASONDataShow.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoimpl implements StudentDao {
    private EntityManager entityManager;

    @Autowired
    public StudentDaoimpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> typedQuery= entityManager.createQuery("from Student ",Student.class);
        return typedQuery.getResultList();
    }

    @Override
    @Transactional
    public String save(Student student) {
       entityManager.persist(student);

        return "inserted succefully";

    }

    @Override
    @Transactional
    public Student updateRecord(Student student) {
        return entityManager.merge(student);
    }

    @Override
    @Transactional
    public void deleteRecord(Integer rollno) {
        Student student=entityManager.find(Student.class,rollno);
        entityManager.remove(student);
        System.out.println("data delete succesfully");

    }


}
