package warmup;

import java.util.Scanner;

public class IfTask {

	public static void main(String[] args) {
		// Make a program which gets the age from the user and displays a different message depending on the age given. Here are the possible responses:
			// age is less than 12, say "You can't create a Facebook account."
			// age is less than 16, say "You can't drive."
			// age is less than 18, say "You can't vote."
			// age is less than 21, say "You can't buy cigarettes and alcohol."
			// age is less than 25, say "You can't rent a car."
			// age is 25 or over, say "You can do anything that's legal."
		
		//Use one-way if statements
		//Use Scanner to get user's age
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your age and I will tell you what you can't do:");
		
		int age = sc.nextInt();
		
		if(age < 12) {
			System.out.println("You can't create a Facebook account.");
					
		}
		
		if (age < 16) {
			System.out.println("You can't drive.");
		}
		
		if(age < 18 ) {
			System.out.println("You can't vote");
		}
		
		if (age < 21) {
			System.out.println("You can't buy cigarettes and alcohol.");
		}
		
		if  (age <25 ) {
			System.out.println("You can't rent a car");
		}
		
		if (age >= 25) {
			System.out.println("You can do whatever that's legal");
		}
		

	}

}
