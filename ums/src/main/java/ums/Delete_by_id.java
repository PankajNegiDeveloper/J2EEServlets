package ums;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete_by_id {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Scanner sc = new Scanner(System.in); //taking input from the user
		System.out.println("Enter the id");
		User u = em.find(User.class, sc.nextInt());
		
		et.begin();
		em.remove(u);
		et.commit();

	}

}
