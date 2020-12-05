package interviewQuestions;

import java.util.Scanner;

public class PrintNumberInReverseOrderWithVariable {

	public static void main(String[] args) throws InterruptedException {
		// Create a program that takes an integer and prints it in reverse order
		// Extra: Store it in a variable and print outside the loop
		//24314 -> 41342
		//23 -> 32
		//4 -> 4
		//122 -> 221
		
		System.out.println("Please enter a number: ");
		int number = new Scanner(System.in).nextInt();
		
		// Use the same logic as previous exercise but adjust it for printing
		int sum = 0;
		String str = "" ; 
		
		while(number > 0) {
			
			//Extract the last digit
			
			int lastDigit = number % 10;
			
			str = str + lastDigit; 
			
			number /= 10;
			
			
		}
		
		System.out.println(str);
		
		int newInt = Integer.parseInt(str); //Convert String into an int
		
		System.out.println(newInt/2);
	
		
		
		
		
		
		
	}

}
