package forloop;

import java.util.Scanner;

public class PrintIndex {

	public static void main(String[] args) {
		// Create a program that gets the user input and print out the characters with their indexes underneath them
		// Use for loop to create the program
		//EX:
		// Hello World
		// H e l l o   W o r l d
		// 
		// 0 1 2 3 4 5 6 7 8 9 10
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		for (int i = 0; i < word.length(); i++) {
			System.out.print(word.charAt(i) + "\t");
			
		}
		
		System.out.println();

		for (int i = 0; i < word.length(); i++) {
			System.out.print("\u2193\t" );
		}
		
		System.out.println();
		
		for (int i = 0; i < word.length(); i++) {
			System.out.print(i + "\t");
		}
		
		
		
		
		
		
		

	}

}
