package constructorChaining;

public class Human {
	
	public Human() {
		
		System.out.println("Inside Human Constructor");
	}
	
	public Human(int i) {
		this();
		System.out.println("Inside Human int Constructor");
	}

}
