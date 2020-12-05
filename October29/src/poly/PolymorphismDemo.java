package poly;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PolymorphismDemo {
	
	
	
	
	// Polymorphism --> an ability of an object to take different forms (Polymorphism --> many forms)
	
	
	public static void main(String[] args) {
		
		
		Animal a = new Animal();
		
		Dog d = new Dog();
		
		
		Animal animal = new Dog();
		
		animal.move();
		
		
		animal = new Snake();
		
		
		animal.move();
		
		
		List<Animal> animals = new ArrayList<>();
		
		animals = new LinkedList<>();
		
		
		
		animals.add(new Dog());
		animals.add(new Bird());
		animals.add(new Snake());
		
		
		for (Animal animall : animals) {
			
			animall.move();
			
		}
		
	//	WebDriver driver = new ChromeDriver();
	//	WebDriver driver = new FirefoxDriver();
		
		
	//encapsulation
	//Inheritance
	//Polymorphism
	//Abstraction
		
		
	}

}
