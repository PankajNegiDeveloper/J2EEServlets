package Collection;

import java.util.ArrayList;

public class CollectionFirst {

	public static void main(String[] args) {

		User u1 = new User(1, "Pankaj");
		User u2 = new User(2, "Rohit");
		User u3 = new User(3, "Gagan");
		User u4 = new User(4, "Tilak");

		ArrayList ar = new ArrayList();
		ar.add(u1);
		ar.add(u2);
		ar.add(u3);
		ar.add(u4);

		System.out.println(ar);
	}

}
