package many_to_one;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Practice {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Kart k = new Kart();
		k.setName("Flikart");

		Product p1 = new Product();
		p1.setName("Laptop");
		p1.setPrice(50000);
		p1.setKart(k);

		Product p2 = new Product();
		p2.setName("Book");
		p2.setPrice(500);
		p2.setKart(k);

		Product p3 = new Product();
		p3.setName("shoes");
		p3.setPrice(2000);
		p3.setKart(k);

		et.begin();
		em.persist(k);
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		et.commit();
	}

}
