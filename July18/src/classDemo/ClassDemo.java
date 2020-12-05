package classDemo;

import java.util.Scanner;

public class ClassDemo {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		String str = "java";
		
		String st = new String();
		
		System.out.println(str.length());
		
		
		Dog rex = new Dog();// Classname varName = new Classname();
		
		rex.woof();
		
		Dog diamond = new Dog();
		
		diamond.woof();
		
		Cat garfield  = new Cat();
		garfield.purr();
		garfield.sleep();

	}

}
