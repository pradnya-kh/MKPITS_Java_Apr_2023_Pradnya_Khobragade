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

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
