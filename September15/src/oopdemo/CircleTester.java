package oopdemo;

public class CircleTester {

	public static void main(String[] args) {


		Circle circle1 = new Circle();
		
	//	System.out.println(circle1.radius); // Not recommended according to the OOP
		
	//	circle1.radius = 10.8; // Not recommended according to the OOP
		
		circle1.setRadius(0.8); // instance methods require an instance(object) of the class
		
		System.out.println(circle1.getRadius());
		
		System.out.println("The area of a circle with radius " + circle1.getRadius() + " is "
		+  circle1.getArea());
		
		System.out.println("The perimeter of a circle with radius " + circle1.getRadius() + " is "
				+  circle1.getPerimeter());

	}

}
