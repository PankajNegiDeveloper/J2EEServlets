package pms;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id //because id is unique(primary key), that's why persistence is used
	//keeping all three as private (Encapsulation)
	private int id; //keeping id as primary in DB
	private String name;
	private double price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
