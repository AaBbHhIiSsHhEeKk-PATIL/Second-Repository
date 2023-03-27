package com.vision.Emb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmbAnn {
	public static void main(String[] args) {
		
		
		  Configuration cfg = new Configuration();
	       cfg.configure("com/vision/Emb/hibernet.cfg.xml");
	       SessionFactory factory = cfg.buildSessionFactory();
	       
	       Students stu = new Students();
	       stu.setId(4);
	       stu.setName("Dev");
	       stu.setStd("03rd");
	       
	       
	       Adresses add = new Adresses();
	       add.setStreet("Street_06");
	       add.setState("Maharashtra");
	       add.setPinCode(423401);
	       
	       stu.setAdd(add);
	       
	       Session session =  factory.openSession();    
	       session.beginTransaction();
	       session.save(stu);
	       session.getTransaction().commit();
	       session.close();
	       factory.close();
	}
}
