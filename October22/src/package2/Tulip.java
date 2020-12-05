package package2;

import package1.Flower;


public class Tulip extends Flower{
	
	
 public  void m1() {
	 
	 // outside of the package, the protected members
	 // are accessible only for subclasses
	 // either directly without a reference
	 // or By using subclass reference
		
		Tulip f = new Tulip();
		
//		Flower f = new Flower(); //accesing protected memebers
		
		// with flower ref is not going to work
	
		//	System.out.println(color);
	//	System.out.println(petals);
		System.out.println(f.isAnnual);
		System.out.println(f.isDeerResistant);
		
	//	grow()	
	//	bloom();
		f.releaseOxygen();
		f.releaseSmell();
		
		
	}
	

}
