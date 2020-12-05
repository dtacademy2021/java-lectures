package warmup;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// Write a program that accepts integer from user
		//and tells the user if the entered number is even or odd
		
		
		//Get the input with Scanner
		//Check if the number is divisible by 2 by  ( number %  == 0 )
		
		
		Scanner sc = new Scanner(System.in);
		//If you have multiple unimported classes you can import all of them at once by
		// CTRL+SHIFT+ O
		System.out.println("Please enter a number to check if it is even or odd:");
		int number = sc.nextInt();
		
		if(number % 2  == 0) {
			System.out.println("The number " + number + " is EVEN");
		}else {
			System.out.println("The number " + number + " is ODD");
		}
		
		
		

	}

}
