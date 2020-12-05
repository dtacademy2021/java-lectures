package interviewQuestions;

import java.util.Scanner;

public class ATMmachine {

	public static void main(String[] args) {
		//Do-while Task
		// ATM Machine login program
		//1.Display welcome message to the user
		//2.Ask the user to enter the pin. The correct pin should be 12345.
		//3. If the pin is correct display "Welcome to your account" message
		//4. If the pin is incorrect repeat the steps 1 and 2.
		//Extra: After 3 tries, display the message "You've entered your wrong pin 3 times. Account locked."
		
		int correctPassword =1234;
		
		Scanner sc= new Scanner(System.in);
		
		int userPassword;
		int count = 0;
		
		do {
			System.out.println("Welcome to the DUOTECH BANK!");
			System.out.println("Please enter your pin: ");
			userPassword = sc.nextInt();
			
			count++;
			
			if(count==3) {
				System.out.println("You've entered your wrong pin 3 times. Account locked.");
				System.out.println("Please take your card.");
				System.exit(0);
			}
		} while (userPassword != correctPassword);
		
		
		
		
		System.out.println("Your pin was correct. Welcome to your account.");
		
		
		
		
		
		
		
		
		
		
		

	}

}
