package com.example.SQLConnectivity.dao;

import com.example.SQLConnectivity.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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
@Override
@Transactional
public void  deleteRecord(Integer rollno){
        Student student=entityManager.find(Student.class,rollno);
        entityManager.remove(student);
        System.out.println("data delete succesfully");
}
@Transactional
    public  Student updateRecord(Student student){
        return entityManager.merge(student);

}

    @Override
    public List<Student> findAll() {

       TypedQuery <Student> typedQuery= entityManager.createQuery("from Student ",Student.class);
        return typedQuery.getResultList();
    }
}
