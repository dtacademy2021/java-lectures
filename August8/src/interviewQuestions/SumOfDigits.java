package interviewQuestions;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// Create a program using  a while loop that calculates the sum of positive digits in an integer
		// 3521621 -> 20
		// 123 -> 5
		// 5 -> 5
		
		
		// Extract each digit one by one starting from the end
		
		System.out.println("Please enter a number: ");
		long number = new Scanner(System.in).nextLong();
		
		int sum = 0;
		
		
		
		while(number > 0) {
			//Get the last digit
			long lastDigit = number % 10;
			
			//Add it into a variable
			sum += lastDigit;
			
			//Get rid of the digit
			number = number / 10; // This will get rid of last digit and update the number without the last digit
			
			
			
		}
		
		System.out.println(sum);

/*
 * In java, if you need a number larger than what long can provide, you can use built-in classes such as BigInteger
 * and BigDecimal
 */
		
			BigInteger b = new BigInteger("-76154673743278647861732678243254376324861671636486178627467186327841674326761");
			
			System.out.println(b);		
			BigDecimal bd = new BigDecimal("253.37626735476537656542656457625674562545265456256532654652365427656453642562543653267543765432525367");
		
			System.out.println(bd);
		
		
	}

}
