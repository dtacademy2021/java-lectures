package reviewsession2;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// Create a program that calculates the sum of numbers
		// Enter 1st number: 200
		// Enter 2nd number: 300
		// The sum is: 5050

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st number: ");

		int numberOne = sc.nextInt();

		System.out.println("Enter 2nd number: ");

		int numberTwo = sc.nextInt();
		
		
		
		int counter = numberOne;
		int sum = 0;
		
		while (counter <= numberTwo) {
			
			sum = sum + counter;
//			System.out.println("The sum is: " + sum);
			
			counter++;
		}
		
		
	//	System.out.println("The sum is " + sum);
		
		
		

	}

}
