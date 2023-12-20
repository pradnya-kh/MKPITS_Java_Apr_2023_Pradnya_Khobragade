package com.example.SpringBootAdvanceMapping.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "Employe_info")
public class Employe {
    @Id
    private int employe_id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    public Employe() {
    }

    public Employe(int employe_id, String name, Address address) {
        this.employe_id = employe_id;
        this.name = name;
        this.address = address;
    }

    public int getEmploye_id() {
        return employe_id;
    }

    public void setEmploye_id(int employe_id) {
        this.employe_id = employe_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}