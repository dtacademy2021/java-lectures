package interfaces;

public class Apple extends Fruit implements Commercializable{

	@Override
	public void eat() {
		System.out.println("Make apple sauce");
		
	}

	@Override
	public void peel() {
		System.out.println("Use a knife");
		
	}

	@Override
	public void makeProfit() {
		System.out.println("Making an apple cider and sell");
		
	}

	@Override
	public void consume() {
		System.out.println("Consuming apple");
		
	}
	
	
	
	
	
	

}
