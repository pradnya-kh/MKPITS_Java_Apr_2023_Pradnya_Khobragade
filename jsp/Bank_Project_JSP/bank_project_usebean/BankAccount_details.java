package com.example.bank_project_usebean;

public class BankAccount_details {
    private String name;
    private String user_id;
    private String password;
    private String mobile;
    private String address;
    private String city;
    private int balance;

    public BankAccount_details() {
    }

    public BankAccount_details(String name, String user_id, String password, String mobile, String address, String city, int balance) {
        this.name = name;
        this.user_id = user_id;
        this.password = password;
        this.mobile = mobile;
        this.address = address;
        this.city = city;
        this.balance = balance;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
