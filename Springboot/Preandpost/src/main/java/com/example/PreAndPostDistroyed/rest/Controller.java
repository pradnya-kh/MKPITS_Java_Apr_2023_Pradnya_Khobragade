package com.example.PreAndPostDistroyed.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private Account account;

    @Autowired

    public Controller(@Qualifier("loanAccount") Account account) {
        this.account = account;

    }

    @GetMapping("/")
    public String show() {
return account.display();
    }

}
