package com.ali.thirdtry;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {

        //load the string configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/com/ali/thirdtry/applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // let's call our new method for fortune
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();
    }

}
