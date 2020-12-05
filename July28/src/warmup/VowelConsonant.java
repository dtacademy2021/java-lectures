package warmup;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// Create a program that gets a character from user and prints "It is a vowel" or "It is a consonant"
		//Use switch statement to create the logic
		//
		
		// Get the user input
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter  a letter and I will tell if it is a vowel or consonant: ");
		
		String input = sc.next();
		input = input.toLowerCase();
		
		//Extract single char out of String
		char ch = input.charAt(0);
		
		//Check if the character is a letter
		if(!(ch >= 'a' && ch <= 'z')) {
			System.out.println("You entered a non letter.");
			System.out.println("The program is terminating...");
			System.exit(0);  //Statement that terminates a java program
		}
		
		//Use switch to display the messages -> "It is a vowel" or "It is a consonant"
		switch (ch) {
		case 'a':
			
		case 'i':
			
		case 'o':
			
		case 'u':
			
		case 'e':
			System.out.println("It is a vowel");
			break;

		default:
			System.out.println("It is a consonant");
			break;
		}
		
		
		
		
		
		
		
		
		
		

	}

}
