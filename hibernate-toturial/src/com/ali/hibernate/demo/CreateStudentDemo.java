package com.ali.hibernate.demo;

import com.ali.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {

    public static void main(String[] args) {

        // Create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        // Create a session

        Session session = factory.getCurrentSession();

        try{

            //create a student object
            System.out.println("createing a new student object");
            Student tempStudent = new Student("Paul","Wall","paul@luv2code");

            // create a transaction
            session.beginTransaction();

            // save the student object to
            System.out.println("Save the student...");
            session.save(tempStudent);

            //commit transaction
            session.getTransaction().commit();
            System.out.println("The job is successfully  done");

        }
        finally {
            factory.close();
        }
    }
}
