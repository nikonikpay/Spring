package com.ali.hibernate.demo;

import com.ali.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class PrimaryKeyDemo {
    public static void main(String[] args) {

        // Create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        // Create a session
        Session session = factory.getCurrentSession();

        try {

            //create 3 student object
            System.out.println("createing 3 student object");
            Student tempStudent1 = new Student("John", "Van den borre", "niko@gmail.com");
            Student tempStudent2 = new Student("Niko", "Jafari", "jafari@hotmail.com");
            Student tempStudent3 = new Student("Paulina", "Wallace", "Wallacina@yahoo.com");

            // create a transaction
            session.beginTransaction();

            // save the student object to
            System.out.println("Save the student...");
            session.save(tempStudent1);
            session.save(tempStudent2);
            session.save(tempStudent3);

            //commit transaction
            session.getTransaction().commit();
            System.out.println("The job is successfully  done");

        } finally {
            factory.close();
        }

    }
}
