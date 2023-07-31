package com.caching.second.level.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class SecondLevelCacheDemo {
	public static void main(String[] args) {
		
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session1 = factory.openSession();
		Student student1 = session1.get(Student.class, 102);
		System.out.println(student1);
		session1.close();

		Session session2 = factory.openSession();
		Student student2 = session2.get(Student.class, 102);
		System.out.println(student2);
		session2.close();

	}

}
