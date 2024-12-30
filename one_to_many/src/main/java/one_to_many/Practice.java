package one_to_many;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Practice {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Product p1 = new Product();
		p1.setName("Mobile");
		p1.setPrice(20000);

		Product p2 = new Product();
		p2.setName("Laptop");
		p2.setPrice(500000);

		Product p3 = new Product();
		p3.setName("Tablet");
		p3.setPrice(35000);

		Product p4 = new Product();
		p4.setName("Desktop");
		p4.setPrice(15000);

		Product p5 = new Product();
		p5.setName("Keyboard");
		p5.setPrice(2000);

		ArrayList<Product> pr_products = new ArrayList();

		pr_products.add(p1);
		pr_products.add(p2);
		pr_products.add(p3);
		pr_products.add(p4);

		Kart k = new Kart();
		k.setName("Amazon");
		k.setProducts(pr_products);

		et.begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		em.persist(p5);
		em.persist(k);
		et.commit();

	}
}
