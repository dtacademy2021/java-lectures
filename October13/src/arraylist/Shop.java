package arraylist;

import java.util.ArrayList;
import java.util.List;

class Product {
	int id;
	String name;

	Product(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class Shop {
		public static void main(String[] args) {
		List<Product> lst = new ArrayList<>();
		lst.add(new Product(10, "IceCream"));
		lst.add(new Product(11, "Chocolate")); 
		Product pi = new Product(10, "IceCream");
		lst.add(pi);
		
		System.out.println(lst.indexOf(pi));
		}
	}
