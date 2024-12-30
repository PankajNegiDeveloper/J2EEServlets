package ums;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save_user {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Scanner sc = new Scanner(System.in); //taking input from the user	
		
		User u = new User();
		System.out.println("Enter the Name");
		u.setName(sc.next());
		System.out.println("Enter the email");
		u.setEmail(sc.next());
		System.out.println("Enter the Phone number");
		u.setPhone(sc.nextLong());
		System.out.println("Enter the Password");
		u.setPassword(sc.next());
		
		
		et.begin();
		em.persist(u);
		et.commit();
	}

}
