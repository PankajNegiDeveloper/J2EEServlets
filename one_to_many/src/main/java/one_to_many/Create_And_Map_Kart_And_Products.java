package one_to_many;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Create_And_Map_Kart_And_Products {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Product p1 = new Product();
		p1.setName("Pen");
		p1.setPrice(20);
		
		Product p2 = new Product();
		p2.setName("Shoes");
		p2.setPrice(2000);
		
		Product p3 = new Product();
		p3.setName("Book");
		p3.setPrice(200);
	
		
		ArrayList<Product> al_procucts= new ArrayList(); //mapping all the products in one object(products)
		al_procucts.add(p1);
		al_procucts.add(p2);
		al_procucts.add(p3);
		
		
		Kart k1 = new Kart();
		k1.setName("Flipkart");
		k1.setProducts(al_procucts);
		
		et.begin();
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(k1);
		
		et.commit();
	}

}
