package game;

import java.util.Scanner;

public class StringExercise5 {

	public static void main(String[] args) {
//		Get 2 strings from the user, a and b, and print out a string of the 
//		form short+long+short, with the shorter string on the outside and the longer string on the inside.
//		
//		"Hello", "hi" → "hiHellohi"
//		 "hi", "Hello" → "hiHellohi"
//		 "aaa", "b" → "baaab"
		
		System.out.println("Enter  2 strings: ");
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
//		if(a.length() > b.length()) {
//			System.out.println(b + a + b);
//		}else {
//			System.out.println(a + b + a);
//		}
		
		System.out.println(  a.length() > b.length()  ?  b + a + b  :   a + b + a   );
		
		
		
		
 
		
	 
		
	}

}
