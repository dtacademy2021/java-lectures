package oop;

public class Cat {
	
	
	String breed;
	String name;
	String gender;
	String color;
	int age;
	
	
	public Cat(String breed, String name, String gender, String color, int age) {
		// this keyword is used in constructors to refer to the instance variables
		// of this class as opposed to the local variables of the same of the constructor
		// parameter
	//	this(); //recursion is not possible with constructors
		
		this.breed = breed;
		this.name = name;
		this.gender = gender;
		this.color = color;
		this.age = age;
	}
	
	
	
	public Cat() {
	//	System.out.println("No arg construstor");
	//	this ("van", "garfield", "male", "orange",10); //Constructor call must be the first statement in a constructor
		
		this ("van", "garfield", "male", "orange",10);
		
		
		// this ()  can be used only inside a constructor
		// We use this () constructor call to save time, not to repeat ouservelves, 
	}
	
	public Cat(String breed) {
		this ();
		
		this.breed= breed;
		}
	
	
	public Cat(String breed, String name) {
		this("van");
		this.name = name;
	}
	
	
	public Cat(String breed, String name, int age) {
		//this ("van ", "kittykat" , 11); // constructors cannot call themselves
		
		this (breed, name); // 
		
	}
	
	
//	public Cat() {}
	
	
//	public Cat(String breed, String name, String gender,
//			   String color, int age) {
//		
//		this.breed = breed;
//		this.name = name;
//		this.gender = gender;
//		this.color = color;
//		this.age =age;
//		
//		//breed = this.breed; //common error
//		//don't do this
//		
//	}
	
	public void changeBreed(String breed) {
		this.breed = breed;
		this.printInfo(); // this can be used both for instance methods and variables
	}
	
	
	public void printInfo() {
		
		
		
	}
	

	
	
	
	













	













	

}
