package com.state;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class StateDemo {

	public static void main(String[] args) {
		// Practical of Object State
		//Transient
		//Persistent
		//Detached
		//Removed
		
		System.out.println("Example: ");
		
		SessionFactory f = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Student s = new Student();
        s.setId(13);
        s.setName("Tom");
        s.setCity("USA");
        //Student : Transient 
        
        Session session = f.openSession();
        Transaction tx = session.beginTransaction();
        session.save(s);
        //Student : Persistent, Database
        s.setName("Jhone");
        tx.commit();
        session.close();
        //Student : Detached
        //s.setName("Mahesh");
        System.out.println("After Dettaching Student:" +s);
        f.close();
	}

}
