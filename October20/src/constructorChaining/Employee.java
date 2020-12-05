package constructorChaining;

public class Employee extends Human{
	
	public Employee() {
		this("cdsnbvcdsv");
		System.out.println("Inside Employee Constructor");
	}

	public Employee(String str) {
		super(9);
		System.out.println("Inside Employee String Constructor");
	}

}
