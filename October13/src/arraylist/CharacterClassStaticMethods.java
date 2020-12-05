package arraylist;

import java.util.Scanner;

public class CharacterClassStaticMethods {

	public static void main(String[] args) {
	
		
		System.out.println("Please enter a character: ");
		
		char ch = new Scanner (System.in).next().charAt(0);
		
		
		if(Character.isDigit(ch)) {
			System.out.println("You entered a number!");
		}else if(Character.isLetter(ch)){
			System.out.println("You entered a letter");
		}else if (! Character.isLetterOrDigit(ch)) {
			System.out.println("You did not enter a number or letter!");
		}
		


		boolean upperCase = Character.isUpperCase('C');
		
		System.out.println(upperCase);
		
		
		


		
		
	}

}
