package com.ali.hibernate.demo;

import com.ali.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudentDemo {

    public static void main(String[] args) {

        // Create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        // Create a session

        Session session = factory.getCurrentSession();

        try {

            //create a student object
            System.out.println("createing a new student object");
            Student tempStudent = new Student("Paul", "Wall", "paul@luv2code");

            // create a transaction
            session.beginTransaction();

            // save the student object to
            System.out.println("Save the student...");
            session.save(tempStudent);
            System.out.println(tempStudent);
            //commit transaction
            session.getTransaction().commit();


            //My New Code for this Section

            //Find out the student's id: primary key
            System.out.println("The genrated id is : " + tempStudent.getId());


            // now get a new seesion and start  transaction
            session = factory.getCurrentSession();
            session.beginTransaction();
            //retrieve student base on the id : primary key
            System.out.println("Getting student with the id of: " + tempStudent.getId());

            Student myStudent = session.get(Student.class, tempStudent.getId());
            System.out.println("get complete " + myStudent);
            //commit the transaction
            session.getTransaction().commit();

            System.out.println("The job is successfully  done");

        } finally {
            factory.close();
        }
    }
}
