package superKeyword;

public class Student {
	
	int id;
	String name;
	String email;
	String address;
	
	
	
	
	
	public Student(int id, String name, String email, String address) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	
	
	// Are constructors inherited into subclasses? Constructors are not inherited
	// Since superclass constructors are not inherited, Java has a mechanism to call a superclass constructor in each subclass constructor
	
	
	

}
