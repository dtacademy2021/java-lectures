package warmup;

import java.util.Scanner;

public class CountChars {

	public static void main(String[] args) {
		// Create a program that gets a string from the user and 
		//prints out the specified character count
		
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string: ");
		String sentence = sc.nextLine();
		System.out.println("Enter the character that you are looking for: ");
		char character = sc.nextLine().charAt(0);
		int count = 0;
		
		for (int i = 0; i < sentence.length(); i++ ) {
			
			
			if(sentence.charAt(i) == character) {
				count++;
			}
			


			
			
			
		}
		
		System.out.println("'" + character + "' occurs " + count + " times.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
	
		
		
	
		
		
	}

}
