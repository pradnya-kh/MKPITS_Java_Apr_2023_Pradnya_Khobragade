package com.example.JASONDataShow.Service;

import com.example.JASONDataShow.entity.Student;
import com.example.JASONDataShow.dao.StudentDao;
import com.example.JASONDataShow.execeptionhandling.RecordNotFoundExcption;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Studentserviceimp implements StudentService{
    private StudentDao studentDao;
    @Autowired
    public Studentserviceimp(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public Student find(Integer rollno) {
    Optional<Student> studentOptional=studentDao.findById(rollno);
    if(studentOptional.isEmpty())
    {
        throw new RecordNotFoundExcption("record not found");
    }

        return studentOptional.get();
    }

    @Override
    @Transactional
    public String insertRecord(Student student) {

            studentDao.save(student);
            return "insert successfully";
        }

    @Override
    @Transactional
    public String UpdateRecord(Student student) {

        Optional optional = studentDao.findById(student.getRollno());
        if (optional.isPresent()) {
            student = (Student) optional.get();
            studentDao.save(student);
        } else {
            System.out.println("data not found");
    }
        return "data updated successfully";
    }


}
