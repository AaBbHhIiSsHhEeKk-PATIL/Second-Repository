package com.vision.With_Maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		//get, load
		Configuration cfg = new Configuration();
		cfg.configure("hibernet.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session =  factory.openSession();
		//get- student id
		Student student = (Student)session.get(Student.class, 2);
		System.out.println(student);
		System.out.println(student.getName());
		session.close();
	}
}
