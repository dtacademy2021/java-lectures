package game;

import java.util.Scanner;

public class RSPWithTernary {

	public static void main(String[] args) {
		// DRY - Don't Repeat Yourself
		// Generate random no for computer

		int computer = 1 + (int) (Math.random() * 3);

		System.out.println(computer);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Rock, 2 for Scissors, 3 for Paper: ");
		// Enter user no
		int user = sc.nextInt();

		// Compare 2 numbers and display the result

	System.out.println( 
			
			
			user ==  1 ?

			"You entered Rock. Computer entered"
					+ (computer == 1 ? " Rock. Draw" : computer == 2 ? " Scissors. You won" : " Paper. You lost") :
			
			user ==  2 ?
					
			"You entered Scissors. Computer entered"
					+ (computer == 1 ? " Rock. You lost" : computer == 2 ? " Scissors. Draw" : " Paper. You won") :
			
		
			"You entered Paper. Computer entered"
					+ (computer == 1 ? " Rock. You won" : computer == 2 ? " Scissors. You lost" : " Paper. Draw")
					
					);
			
		
			
			

		
	}
	

}
