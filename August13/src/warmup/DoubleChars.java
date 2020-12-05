package warmup;

import java.util.Scanner;

public class DoubleChars {

	public static void main(String[] args) {
		
//		Given a string, create a string where for every char in the original, there are two chars.

//		"The" → "TThhee"
//		"AAbb" → "AAAAbbbb"
//		"Hi-There" → "HHii--TThheerree"
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string: ");
		String sentence = sc.nextLine();
		
		String doubledString = "";
		
		for (int i = 0; i < sentence.length(); i++) {
			
			
			doubledString  =  doubledString +  sentence.charAt(i) + sentence.charAt(i);
			
		}
		
		
		
		System.out.println(doubledString);
		
		
		
		

	}

}
