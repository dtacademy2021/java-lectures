package oopdemo;

public class Car {
	
	
	
	// instance -> object
	
	// Properties
	// Instance variables
	String make; // If we don't assign initial value to instance variables, they get default values
	String model;
	int year;
	int mileage;
	String bodyType;
	String color = "white";
	double engineSize;
	boolean isManual;
	int speed;
	 
	
	
	//Behaviors
	// Instance methods
	
	public void accelerate() {
		System.out.println( make + " " + model +   " is accelerating");
	}
	
	public void decelerate() {
		System.out.println(make + " " + model +   " is slowing downg");
	}
	
	
	public void honk() {
		System.out.println(make + " " + model +   " is using horn");
	}
	
	public void drift() {
		System.out.println(make + " " + model +   " is drifting");
	}
	
	public void selfPark() {
		System.out.println(make + " " + model +   " is parking itself");
	}
	
	
	public static void main(String[] args) {
		Car c1 = new Car();
		
		System.out.println(c1.make);
	}
		
	
}
