package com.example.SpringBootAdvanceMapping.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "address_info")
public class Address {
    @Id

    private int address_id;
    private String city;
    private String address;

    public Address() {
    }

    public Address(int address_id, String city, String address) {
        this.address_id = address_id;
        this.city = city;
        this.address = address;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
