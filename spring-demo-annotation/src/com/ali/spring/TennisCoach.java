package com.ali.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;


    public TennisCoach() {
        System.out.println("Tennis Coach : Inside default constructor");
    }

    // define my init method for
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(" insid edo my start uo stuff");
    }


    // define m,y destroy method
    @PreDestroy
    public void doMyDestroy() {
        System.out.println(" inside the do my destroy method");
    }

    //    public TennisCoach(FortuneService fortuneService) {
    //        System.out.println("Inside parameter Constructor");
    //        this.fortuneService = fortuneService;
    //    }
    //    @Autowired
    //    public void setFortuneService(FortuneService fortuneService) {
    //        System.out.println("inside the setter");
    //        this.fortuneService = fortuneService;
    //    }

    @Override
    public String getDailyWorkout() {
        return "we are inside the tennis coach daily workout";
    }


    @Override
    public String getDailyFortune() {
        return fortuneService.getFortunes();
    }
}
