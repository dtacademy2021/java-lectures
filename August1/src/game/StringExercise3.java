package game;

import java.util.Scanner;

public class StringExercise3 {

	public static void main(String[] args) {
//		 Get a string from the user, print out a new string made of 3 copies 
		//of the last 2 chars of the original string.
//		"Hello" → "lololo"
//		 "ab" → "ababab"
//		 "Hi" → "HiHiHi"
		
		System.out.println("Enter  a string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int index = str.length()-2;
		
		String lastTwo = str.substring(index);
		
		System.out.println(lastTwo + lastTwo + lastTwo);
		
		
		
 
		
	 
		
	}

}
