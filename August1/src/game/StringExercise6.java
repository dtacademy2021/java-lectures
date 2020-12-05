package game;

import java.util.Scanner;

public class StringExercise6 {

	public static void main(String[] args) {
//		Get a string from the user, and print out a "rotated left 2" version 
//		where the first 2 chars are moved to the end.
		
//		"Hello" → "lloHe"
//		 "java" → "vaja"
//		 "Hi" → "Hi"
//		"Duotech" -> "otechDu"
		
		System.out.println("Enter  2 strings: ");
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		
		String firstTwo = a.substring(0,2);
		String rest     = a.substring(2);			
		
		
		System.out.println(rest + firstTwo);
		
		String empty = ""; // empty string
		
	 
		
	}

}
