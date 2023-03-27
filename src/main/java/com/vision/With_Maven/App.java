package com.vision.With_Maven;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

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
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Started" );
        //SessionFactory:- it is a interface, we
        //we cann't create object interface so we take configuration
        //it is thread safe object (SessionFactory will give Session and
        //session will help to save data and object
        
 //SessionFactory factory = new Configuration().configure("hibernet.cfg.xml").buildSessionFactory();
        //Configuration have a function "configure" and call 
        //buildSessionFactory it will return sessionFactory object & that will came in factory(reference)
        //OR
       Configuration cfg = new Configuration();
       cfg.configure("hibernet.cfg.xml");
       SessionFactory factory = cfg.buildSessionFactory();
//       
      Student st = new Student();  
      st.setId(5);
      st.setName("Sagar");
      st.setCity("Nashik");
      System.out.println(st);
      
      Address ad =new Address();
      ad.setStreet("street2");
      ad.setCity("Nashik");
      ad.setOpen(true);
      ad.setAddedDate(new Date());
      ad.setX(124.568);
      
      //Insert Image
      FileInputStream fis = new FileInputStream("src/main/java/Motivation.jpg");
      byte[] data=new byte[fis.available()];
      fis.read(data);
      ad.setImage(data);
      System.out.println("image inserted....");
      
      
        
       Session session =  factory.openSession();                                                 
       //Transaction tx = session.beginTransaction();
       session.beginTransaction();
       session.save(st);
       session.save(ad);
       session.getTransaction().commit();
       session.close();
       
    }
}
