package game;

import java.util.Scanner;

public class StringExercise1 {

	public static void main(String[] args) {
//		//Given a string, print out a version without the first and last char, 
		//so "Hello" yields "ell". The string length will be at least 2.
		
//		"Hello" → "ell"
//		"java" → "av"
//		"coding" → "odin"
		
		
		
		
		
		
		System.out.println("Please enter a String: ");
		String str = new Scanner(System.in).nextLine();
		
		
		

        String out = str.substring(1, str.length()-1);
		System.out.println(out);
		
		
		
 
		
	 
		
	}

}
