package com.example.BeansScope.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private  Account account1;
    private  Account account2;
@Autowired
    public Controller(@Qualifier("currentAccount") Account account1,@Qualifier("currentAccount") Account account2) {
        this.account1 = account1;
        this.account2 = account2;
    }
    @GetMapping("/")
    public String show(){
        return account1.display();
    }
    @GetMapping("/abc")
    public boolean show1(){
    return account1==account2;

    }

}
