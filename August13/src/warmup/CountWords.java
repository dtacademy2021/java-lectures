package warmup;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		// Create a program that checks the count of string "hi" in a given string
		// "Hello hi hi hi" -> 3
		// "Hihihi" -> 2
		// "AbchiHi" -> 1
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string: ");
		String sentence = sc.nextLine();
		System.out.println("Enter the character that you are looking for: ");
		String searchedWord = sc.nextLine();
		
		int length = searchedWord.length();
		
		
		int count = 0;
		
		for (int i = 0; i <= sentence.length()-length; i++) {
			
			if(sentence.substring(i, i+length).equalsIgnoreCase(searchedWord)) {
				count++;
			}
			
		}
		
		System.out.println("The count of searched word " + searchedWord + " is " + count);

	}

}
