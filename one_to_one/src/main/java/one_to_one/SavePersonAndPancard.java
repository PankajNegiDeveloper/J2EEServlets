package one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonAndPancard {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();

		PanCard pc = new PanCard();
		pc.setpNo("XYZ123");
		pc.setPin(5678);

		Person p = new Person();
		p.setName("Aman");
		p.setEmail("Aman@gmail");
		p.setPc(pc);

		et.begin();
		em.persist(p); //this method will store the data into table
		em.persist(pc); //this method will store the data into table
		et.commit();
	}
}
