package com.ali.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class SwimCoach implements Coach {

    @Value("${foo.email}")
   private String email;

    @Value("${foo.password}")
   private String password;

    private FortuneService fortuneService;


    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }



    public SwimCoach(FortuneService fortuneService) {
        System.out.println("Inside swim coach constructor");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "we are inside the swim coach daily workout";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortunes();
    }
}
