package com.caching.firstcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class FirstLevelCacheDemo {
	public static void main(String[] args) {
	
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		//by default enabled
		Student student = session.get(Student.class, 103);
		System.out.println(student);
		System.out.println("Working..................");
		Student student1 = session.get(Student.class, 103);
		System.out.println(student1);
		System.out.println(session.contains(student1));
		session.close();
	}

}
