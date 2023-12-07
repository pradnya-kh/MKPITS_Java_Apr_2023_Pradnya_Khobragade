package com.example.Theamleaf_FirstProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.apache.logging.log4j.message.Message;
import org.springframework.lang.NonNull;

@Entity
public class Student {
    @Id
    private int rollno;
    @Size(min=1,message = "is reqired")
   @NotNull(message = "* is requred")
    private String name="";
    private  String address;
    private  String city;
     private String gender;
     private  String subject;

    public Student() {
    }

    public Student(int rollno, String name, String address, String city,String gender,String subject) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
        this.city = city;
        this.gender=gender;
        this.subject=subject;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
