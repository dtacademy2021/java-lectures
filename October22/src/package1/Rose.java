package package1;

public class Rose extends Flower{
	
	
	public static void main(String[] args) {
		
		
		Rose r = new Rose();
		
	//	System.out.println(r.color);
		System.out.println(r.petals);
		System.out.println(r.isAnnual);
		System.out.println(r.isDeerResistant);
		
	 // r.grow()	
		r.bloom();
		r.releaseOxygen();
		r.releaseSmell();
		
		
	}
	

}
