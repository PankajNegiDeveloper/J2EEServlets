package ums;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev"); // global
	static EntityManager em = emf.createEntityManager(); // global
	static Scanner sc = new Scanner(System.in); // global

	public static void main(String[] args) {
		while (true) {
			System.out.println("Enter the Option");
			System.out.println("1. Save user data");
			System.out.println("2. Fetch user data");
			System.out.println("3. Delete user data");
			System.out.println("4. Update user data");
			switch (sc.nextInt()) {
			case 1:
				userSave();
				break;
			case 2:
				userFetch();
				break;
			case 3:
				userDelete();
				break;
			case 4:
				userUpdate();
				break;
			default:
				System.out.println("Invalid option");
				System.out.println("Choose the option again");
				System.out.println();
				break;
			}
		}
	}

	static void userSave() {
		EntityTransaction et = em.getTransaction();
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

	static void userFetch() {
		EntityManager em = emf.createEntityManager();
		System.out.println("Enter the Id");
		User u = em.find(User.class, sc.nextInt()); // fetching data by Id
		System.out.println(u.getId());
		System.out.println(u.getName());
		System.out.println(u.getEmail());
		System.out.println(u.getPhone());
		System.out.println(u.getPassword());
	}

	static void userDelete() {
		EntityTransaction et = em.getTransaction();
		System.out.println("Enter the id");
		User u = em.find(User.class, sc.nextInt());
		et.begin();
		em.remove(u);
		et.commit();
	}

	static void userUpdate() {
		EntityTransaction et = em.getTransaction();
		System.out.println("Enter the Id");
		User u = em.find(User.class, sc.nextInt());
		System.out.println("Enter new password");
		u.setPassword(sc.next());
		et.begin();
		em.merge(u);
		et.commit();
	}
}
