package warmup;

import java.util.Random;

public class RandomString {

	public static void main(String[] args) {
		// Create  a method that takes an int as an argument and prints a random string with the indicated length
		// Examples:
		// printRandom(5) -> dshgs
		// printRandom(10) -> zvxvvgsgas
		
		// Use for loop
		// in the loop generate a random char between the range of lowercase chracters of ASCII
		
		
		printRandom(20);
		
		printRandom(50);
		
		
		printRandom(100);
		

	}
	
	
	public static void printRandom(int length) {
		
		for (int i = 0; i < length; i++) {
			
			char ch = (char)(97 + (int)(Math.random()*26));
			System.out.print(ch);

			
		}
		
		System.out.println();
		
		String str = "scdbvbvsda";
		
		
		
		
		
		
		
	}
	
	

}
