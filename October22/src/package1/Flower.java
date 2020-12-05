package package1;

public class Flower {
	
	private String color;
	int petals;
	protected boolean isAnnual;
	public boolean isDeerResistant;
	
	
	private void grow() {
		
	}
	
	void bloom() {
		
	}
	
	protected void releaseOxygen() {
		
	}
	
	public void releaseSmell() {
		
	}
	
	
	public static void main(String[] args) {
		
		Rose r = new Rose();
		
	//	System.out.println(r.color);
		System.out.println(r.petals);
		System.out.println(r.isAnnual);
		System.out.println(r.isDeerResistant);
		
	 //   r.grow();	
		r.bloom();
		r.releaseOxygen();
		r.releaseSmell();
	}

}


