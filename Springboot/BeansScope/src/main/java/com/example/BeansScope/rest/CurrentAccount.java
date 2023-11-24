package com.example.BeansScope.rest;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CurrentAccount implements Account {
    public CurrentAccount() {
        System.out.println("Constructor of current");
    }

    public String display(){
        return "this is current Account";
    }
}
