package forloop;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		// Create  program that takes user input and displays it in reverse
		// Use for loop
		// Java -> avaJ
		// Java is fun -> nuf si avaJ
		
		
		//Loop through the string from the end till the beginning
		
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String reversed = "";
		
//		for (int i = word.length()-1; i >= 0; i--) {
//			System.out.print(word.charAt(i));
//		}
		
		for (int i = word.length()-1; i >= 0; i--) {
			reversed = reversed  + word.charAt(i);
		}
		
		//While loop version
//		int i = word.length()-1;
//		while(i >= 0) {
//			reversed = reversed  + word.charAt(i);
//			i--;
//		}
		
		System.out.println(reversed);

	}

}
