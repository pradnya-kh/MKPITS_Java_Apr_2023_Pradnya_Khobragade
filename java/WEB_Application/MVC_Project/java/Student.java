/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pradnya
 */
public class Student {
     private String rollno;
    private String name;
    private String address;
    private String city;

    public Student(String rollno, String name, String address, String city) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
        this.city = city;
    }

  

    Student() {
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
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

   
}
