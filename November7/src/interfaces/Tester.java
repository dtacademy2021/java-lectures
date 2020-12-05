package interfaces;

public class Tester {
	
	public static void main(String[] args) {
		
		
		Edible.finish();
		
//		Chicken.finish();
		//Static methods of Interfaces are not inherited by subclasses
		Chicken.start();
	}

}
