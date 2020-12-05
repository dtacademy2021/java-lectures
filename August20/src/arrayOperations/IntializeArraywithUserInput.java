package arrayOperations;

import java.util.Arrays;
import java.util.Scanner;

public class IntializeArraywithUserInput {
	
	

	public static void main(String[] args) {
		//Create a program that gets the numbers from the user into an array and
		// prints out the average of those numbers
		//Enter the how many guesses you would like to input:
		//Enter the guesses: 
		//The average of guessses is 
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the how many guesses you would like to input:");
	    
		int length = sc.nextInt();
		
		int [] guesses = new int [length];
		
		
		System.out.println("Enter "+length+ " guesses: ");
		
		int sum = 0;

		for (int i = 0; i < guesses.length; i++) {
			
			int input = sc.nextInt();
			
			if(!(input> 0)) // sentinel value
				break;     // useful scenario for break;
			
			
			guesses[i] = input;
			
			
			sum += guesses[i];
			
		}
		
		System.out.println(Arrays.toString(guesses));
		
		System.out.println("The average of " + length + " guesses is: " + sum/length);
		
		
		
		
		
		
	
		
		
		
		
		
		

	}

}
