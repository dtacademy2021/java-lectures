package game;

import java.util.Scanner;

public class StringExercise2 {

	public static void main(String[] args) {
//		Get the String from the user, print out the string made of its first two chars, 
//      so the String "Hello" yields "He". If the string is shorter than length 2, 
//      print out whatever there is, so "X" yields "X", and the empty string "" yields the empty string ""
//		
//		Ex:
//		"Hello" → "He"
//		"abcdefg"→ "ab"
//		"ab" → "ab"
//		 "x" -> "x"
		
		
		String str = new Scanner(System.in).next();
		
		
		if(str.length()>=2) {
			System.out.println(str.substring(0, 2));
		}else {
			System.out.println(str);
		}
		
	//	System.out.println(str.length()>=2 ? str.substring(0, 2) : str); // Ternary version
		
 
		
	 
		
	}

}
