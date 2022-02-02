package com.ali.thirdtry;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterdemoApp {

    public static void main(String[] args) {
        //load spring configuration file

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/com/ali/thirdtry/applicationContext.xml");

        // retrieve bean from spring container

        CricketCoach cricketCoach = context.getBean("myCricketCoach",CricketCoach.class);


        // call methods on the bean
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());

        //call our new methods
        System.out.println(cricketCoach.getEmailAddress());
        System.out.println(cricketCoach.getTeam());

        // close the context

        context.close();

    }
}
