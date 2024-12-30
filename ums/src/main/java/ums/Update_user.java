package ums;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update_user {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Id");
		User u = em.find(User.class, sc.nextInt());
		
		System.out.println("Enter new password");
		u.setPassword(sc.next());
		
		et.begin();
		em.merge(u);
		et.commit();
	}
}
