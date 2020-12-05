package interfaces;

public class Orange extends Fruit{

	@Override
	public void eat() {
		System.out.println("Make orange juice");
		
	}

	@Override
	public void peel() {
		System.out.println("Use your hands");
		
	}
	
	
	@Override
	public void consume() {
		System.out.println("Consuming orange");
		
	}

}
