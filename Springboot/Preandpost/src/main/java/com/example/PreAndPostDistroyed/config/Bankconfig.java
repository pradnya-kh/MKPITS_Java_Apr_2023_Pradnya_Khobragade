package com.example.PreAndPostDistroyed.config;

import com.example.PreAndPostDistroyed.rest.Account;
import com.example.PreAndPostDistroyed.rest.LoanAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Bankconfig {
    @Bean
    public Account loanAccount(){
        return new LoanAccount();
    }

}
