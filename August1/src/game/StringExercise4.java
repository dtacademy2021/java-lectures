package game;

import java.util.Scanner;

public class StringExercise4 {

	public static void main(String[] args) {
//		 Get a string of even length from the user, print out the first half. So the string "WooHoo" yields "Woo".
//		"WooHoo" → "Woo"
//		 "HelloThere" → "Hello"
//		 "abcdef" → "abc"
		
		System.out.println("Enter  a string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int mid = str.length()/2;
		
		System.out.println(str.substring(0, mid));
		
		
 
		
	 
		
	}

}
