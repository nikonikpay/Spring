package com.ali.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeApp {
    public static void main(String[] args) {
        //load Spring configuration
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        //retrieve bean from the spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alfaCoach = context.getBean("tennisCoach", Coach.class);

 // check if the the same object
        boolean result = ( theCoach.equals( alfaCoach));

        //print the results
        System.out.println("Pointing to the same object " +result);


        context.close();
    }
}