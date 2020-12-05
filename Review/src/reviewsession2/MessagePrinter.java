package reviewsession2;

import java.util.Scanner;

public class MessagePrinter {

	public static void main(String[] args) {
		// Write a program that prints a message from the user indicated amount of times
		// Eg: 
		  //Enter a message: Hello
		// How many times?: 5
		// Hello
		// Hello
		// Hello
		// Hello
		
		
		
		//PSEUDOCODE
		//1. Get the message and times from the user
		//2. Use while loop to print the message indicated amount of times
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the message:");
		
		String str = sc.nextLine();
		
		System.out.println("How many times?: ");
		
		int times = sc.nextInt();
		
		
		int counter = 0;
		
		
		while(counter < times) {
			
			
			System.out.println(str);
			
			counter++;
		}
		
		
		
		

	}

}
