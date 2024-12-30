package ums;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch_user {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		// no need of entity transaction here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Id");
//		User u = em.find(User.class, 1); //1 here is id
		User u = em.find(User.class, sc.nextInt()); //fetching data by Id

		System.out.println(u.getId());
		System.out.println(u.getName());
		System.out.println(u.getEmail());
		System.out.println(u.getPhone());
		System.out.println(u.getPassword());
	}

}
