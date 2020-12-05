package polymorphism;

public class Tester {

	public static void main(String[] args) {

   //Polymorphism -> 
		// an ability of an object to take many forms
	// when a reference of a declared type is assigned an object of subtype
		
		Object o = new Hotel();
		
		System.out.println(o.toString());
		
		// o's declared type -> Object
		// o's actual type -> Hotel
		
		
		Object o1 = new Object();

	}

}
