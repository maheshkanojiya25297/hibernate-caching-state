package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchMethod {

	public static void main(String[] args) {
		// Get, Load
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		//Student student =(Student)session.get(Student.class, 102);
		Student student =(Student)session.load(Student.class, 102);
		System.out.println("Get Details of student {} :" +student);
		
		Address address = (Address)session.get(Address.class,1);
		System.out.println("Get Details of address {} :" +address.getCity()+" : "+address.getStreet());
		
		session.close();
		factory.close();

	}

}
