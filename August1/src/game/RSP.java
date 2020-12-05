package game;

import java.util.Scanner;

public class RSP {

	public static void main(String[] args) {
		// DRY - Don't Repeat Yourself
		// Generate random no for computer

		int computer =  (int) (Math.random() * 4);

		System.out.println(computer);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Rock, 2 for Scissors, 3 for Paper: ");
		// Enter user no
		int user = sc.nextInt();

		// Compare 2 numbers and display the result

		switch (user) {

		case 1:

			System.out.println("You entered Rock. Computer entered"
					+ (computer == 1 ? " Rock. Draw" : computer == 2 ? " Scissors. You won" : " Paper. You lost"));
			break;
		case 2:
			System.out.println("You entered Scissors. Computer entered"
					+ (computer == 1 ? " Rock. You lost" : computer == 2 ? " Scissors. Draw" : " Paper. You won"));
			break;
		case 3:
			System.out.println("You entered Paper. Computer entered"
					+ (computer == 1 ? " Rock. You won" : computer == 2 ? " Scissors. You lost" : " Paper. Draw"));
			break;
		default:
			System.out.println("Invalid choice");
			System.exit(0);
			

		}

	}

}
