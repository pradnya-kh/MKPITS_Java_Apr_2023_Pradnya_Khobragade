/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empolye;

/**
 *
 * @author user
 */
public class Address {
    private String city;
    private String state;
    private String country;

    public Address() {
    }

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" + "city=" + city + ", state=" + state + ", country=" + country + '}';
    }
    
}
