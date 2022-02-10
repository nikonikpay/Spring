package com.ali.hibernate.demo;

import com.ali.hibernate.demo.entity.Instructor;
import com.ali.hibernate.demo.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {

    public static void main(String[] args) {

        // Create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

        // Create a session

        Session session = factory.getCurrentSession();

        try {
            // create a transaction
            session.beginTransaction();

            // get instructor by primary key
            int theId = 1;
            Instructor tempInstructor = session.get(Instructor.class, theId);

            System.out.println("Found instructor" + tempInstructor);
            // delete the instructor
            if(tempInstructor != null) {


                System.out.println("Deleting :" + tempInstructor);

                //Also delete associated detail object
                session.delete(tempInstructor);
            }

            //commit transaction
            session.getTransaction().commit();
            System.out.println("The job is successfully  done");

        } finally {
            factory.close();
        }
    }
}
