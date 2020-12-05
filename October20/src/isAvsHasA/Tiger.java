package isAvsHasA;

import java.util.ArrayList;
import java.util.LinkedList;

public class Tiger extends Animal {
	
	
	int age;
	double weight;
	String name;
	Nose n;   	// HAS-A relationship is when a class contains another class's reference as a field/property
	          	// Aggregation
			   // Aggregation vs Composition -> In composition, the class that is part of another class as its property cannot exist without it
			
	
	Stripes s; // Nose is an example of an aggregation (Nose can exist as an independent class of its own) 
				// and Stripes is an example of a composition (Stripes cannot exist independently without a Tiger class)
	
	
	
	LinkedList l; // LinkedList and Node have composition relationship, because Node is used exclusively in LinkedList class
	
	
	
	
	public Tiger(int age, double weight, String name, Nose n) {
		
		this.age = age;
		this.weight = weight;
		this.name = name;
		this.n = n;
	}
	
	class Stripes{  // inner class
		
	}
	

}
