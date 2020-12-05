package forloop;

import java.util.Scanner;

public class ReverseANumberWithFor {

	public static void main(String[] args) {
		
		
		System.out.println("Please enter a number: ");
		int number = new Scanner(System.in).nextInt();
		// Use the same logic as previous exercise but adjust it for printing
		int sum = 0;
		
		
//		while (number > 0) {
//			// Extract the last digit
//			int lastDigit = number % 10;
//			System.out.print(lastDigit); // prints each digit starting from the end
//			sum += lastDigit; // gets the sum of digits
//			number /= 10;
//		}
		
		
		for ( ; number > 0 ; number /= 10) {
			int lastDigit = number % 10;
			System.out.print(lastDigit); // prints each digit starting from the end
			sum += lastDigit; // gets the sum of digits
			
		}
		
		
		
		System.out.println();
		System.out.println(sum);

	}

}
