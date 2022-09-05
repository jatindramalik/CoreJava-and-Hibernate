package com.gudi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   
        AlienName an = new AlienName();
        an.setFname("jatin");
        an.setMname("kumar");
        an.setLname("malik");

       Alien alien = new Alien();
       alien.setAid(101);
       alien.setAname(an);
       alien.setColor("black");

       Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);

       SessionFactory sf = con.buildSessionFactory();
       Session session = sf.openSession();

       Transaction tx = session.beginTransaction();
       session.persist(alien);
    //    alien = (Alien)session.get(Alien.class, 103);
       tx.commit();

    //    System.out.println(alien);
       
    }
}
