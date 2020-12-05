package interfaces;

public class Chicken extends Animal implements Edible, Commercializable{

	@Override
	public void makeSound() {
		System.out.println("Cluck-cluck");
		
	}

	@Override
	public void eat() {
		System.out.println("Fried chicken");
		
	}

	@Override
	public void makeProfit() {
		System.out.println("Grow and sell");
		
	}
	
	@Override
	public void consume() {
		System.out.println("Consuming chicken");
		
	}
	
	
//	public default void ingest() {
//		System.out.println("Ingesting");
//	}
	
//	Default methods are allowed only in interfaces.

}
