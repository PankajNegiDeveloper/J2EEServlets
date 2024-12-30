package pms;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev"); // making global
	static EntityManager em = emf.createEntityManager(); // making global

	public static void main(String[] args) {
		
		//TO SAVE
		
		Product p = new Product();
//		p.setId(1); // added
//		p.setName("Pen"); // added						
//		p.setPrice(20); // added
		
		p.setId(3);
		p.setName("pencil");
		p.setPrice(5);
//		static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev"); //check above
//		static EntityManager em = emf.createEntityManager(); //check above
		EntityTransaction et = em.getTransaction();

		et.begin();
		em.persist(p);
		et.commit();
		
		//Code to FIND an object from data
		
//		Product f = em.find(Product.class, 2);
//		System.out.println(f.getId());
//		System.out.println(f.getName());
//		System.out.println(f.getPrice());
		
		//Code to DELETE an object from data
		
//		Product f = em.find(Product.class, 2);
//		EntityTransaction et = em.getTransaction();
//		et.begin(); //since the one row is deleted, it's our responsibility to begin the transation again, that's why this code is used
//		et.remove(f);
//      et.commit();
		
		//CODE to UPDATE the data
		
//		Product f = em.find(Product.class, 2);
//		p.setPrice(50);
//		EntityTransaction et = em.getTransaction();
//		et.begin();
//		em.merge(f);
//		et.commit();
	}
}
