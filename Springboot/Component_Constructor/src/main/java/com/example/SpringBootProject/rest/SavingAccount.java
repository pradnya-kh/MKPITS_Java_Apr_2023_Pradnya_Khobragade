package com.example.SpringBootProject.rest;

import org.springframework.stereotype.Component;

@Component
public class SavingAccount implements Account {
    public  String display(){
        return "this is Saving Account";
    }

}
