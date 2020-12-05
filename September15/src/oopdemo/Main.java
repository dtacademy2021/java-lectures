package oopdemo;

public class Main {

	public static void main(String[] args) {
		// array -> reference type
		// class -> reference type
		
		
	
		
		// ClassName name = new ClassName(); -> general template to create an object of the class
		
		
		Car toyota  =  new Car();
		// To access instance variable objName.VarName
		toyota.make = "Toyota";
		toyota.model = "Tundra";
		toyota.year = 2020;
		toyota.mileage = 134;
		toyota.bodyType = "Pickup Truck";
		toyota.engineSize = 5.6;
		toyota.color = "Pearl White";
		toyota.isManual = false;
		toyota.speed = 0;
		
		System.out.println("The color of the toyota is " + toyota.color);
		System.out.println("The body type of the toyota is " + toyota.bodyType);
		System.out.println("The model of the toyota is " + toyota.model);
		
		//To call methods on an object -> objName.methodName
		
		toyota.honk();
		toyota.accelerate();
		toyota.drift();
		
		
		
		
		
//		Car bmw = new Car();
//		
//		System.out.println(bmw.color);
		
		
		
		

	}

}
