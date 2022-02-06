package com.ali.hibernate.demo;

import com.ali.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class UpdateStudentDemo {

    public static void main(String[] args) {

        // Create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        // Create a session

        Session session = factory.getCurrentSession();

        try {

            int studentId =1;
            session=factory.getCurrentSession();
            session.beginTransaction();

            Student student = session.get(Student.class, studentId);

            student.setFirstName("Scooby");

            //commit transaction
            session.getTransaction().commit();

            //new code

            session = factory.getCurrentSession();
            session.beginTransaction();

            System.out.println("Update email for all student");
            session.createQuery("update Student set email='niko@gmail.com'").executeUpdate();


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
