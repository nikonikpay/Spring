package com.ali.hibernate.demo;

import com.ali.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryStudentDemo {

    public static void main(String[] args) {

        // Create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        // Create a session

        Session session = factory.getCurrentSession();

        try {

            // create a transaction
            session.beginTransaction();

            //query the student
            List<Student> theStudent = session.createQuery("from Student").list();

            // display the student
            displayStudents(theStudent);
            // query student : last name = 'wall'
            theStudent = session.createQuery("from Student s where s.lastName='Wall'").list();

            //Display the student
            System.out.println("Student who have last name of Wall\n");
            displayStudents(theStudent);

            //commit transaction
            session.getTransaction().commit();
            System.out.println("The job is successfully  done");

        } finally {
            factory.close();
        }
    }

    private static void displayStudents(List<Student> theStudent) {
        for(Student student : theStudent) {
            System.out.println(student);
        }
    }
}
