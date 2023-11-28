package com.example.SQLConnectivity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
    @Id
    private  int rollno;
    private  String name;
    private  String address;
    private  String city;

    public Student() {
    }

    public Student(String name, String address, String city) {
        
        this.name = name;
        this.address = address;
        this.city = city;
    }
}
