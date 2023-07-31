package com.tut;

import java.io.FileInputStream;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("Project Started............");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		System.out.println("factory: " + factory);
		System.out.println(factory.isClosed());

		// creating student Object
		Student st = new Student();
		st.setId(103);
		st.setCity("PUNE");
		st.setName("ALROY KAPOOR");

		// creating address Object
		Address address = new Address();
		address.setCity("Pune");
		address.setStreet("L B Marg");
		address.setOpen(true);
		address.setAddedDate(new Date());
		address.setX(123.677);

		// Reading Image
		FileInputStream fis = new FileInputStream("src/main/java/pic.png");
		byte[] data = new byte[fis.available()];
		fis.read(data);
		address.setImage(data);
		
		System.out.println(st);
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(st);
		session.save(address);
		session.getTransaction().commit();
		session.close();
		System.out.println("done...");
	}
}
