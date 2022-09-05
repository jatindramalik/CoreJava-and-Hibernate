package com.siddhu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        

        Laptop laptop = new Laptop();
        laptop.setLid(1);
        laptop.setLaname("Dell");

        Student student = new Student();
        student.setRollno(101);
        student.setName("jatin");
        student.setMarks(55);
        student.getLaptop().add(laptop);

        laptop.getStudent().add(student);

        Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        session.persist(laptop);
        session.persist(student);
        session.getTransaction().commit();
    }
}
