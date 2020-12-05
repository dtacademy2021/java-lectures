package string;

import java.util.Scanner;

public class StringExercise7 {

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
		
		String str = sc.next();
		String searched = sc.next();
		
		
		if(str.indexOf(searched)==0 || str.indexOf(searched)==1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		System.out.println(str.indexOf(searched)==0 || str.indexOf(searched)==1 ? true : false );
		
		
		
		
		

	}

}
