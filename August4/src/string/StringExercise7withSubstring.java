package string;

import java.util.Scanner;

public class StringExercise7withSubstring {

	public static void main(String[] args) {
		
//		Get a string from the user, print true if "bad" appears starting at index 0 or 1 
		//in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx".
		//Also consider for String being an empty string or with length 1,2,3
//		
//		"badxx" → true
//		"xbadxx" → true
//		"xxbadxx" → false
//		"a" -> false
//		"ba" -> false
//		"" -> false
		
		
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		String searched = sc.next();
		
		if (word.length() < 3) {
			
			System.out.println(false);
		} else if (word.substring(0, 3).equals(searched)) {
		
			System.out.println(true);
		} else if (word.substring(1, 4).equals(searched)) {
			
			System.out.println(true);
		} else  {
			
			System.out.println(false);
		} 
		
		
		
		
		
		
		

	}

}
