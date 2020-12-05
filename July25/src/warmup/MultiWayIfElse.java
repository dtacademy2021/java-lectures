package warmup;

import java.util.Scanner;

public class MultiWayIfElse {

	public static void main(String[] args) {
		// Create a program that evaluates students' grade and convert it into from
		// numeric to a letter grade -> 100-90 -> A, 89-80-> B, 79-70->C, 69-60->D
		// everything under 60 is F
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your grade: ");
		
		int grade = sc.nextInt();
		
		if(!(grade >=0 && grade <=100)) {
			System.out.println("You entered a grade that is out of range.");
			System.out.println("The program is terminating.");
			System.exit(0); //terminates the program 
		}
		
		if (grade >= 90) {
			System.out.println("You received A");
		} else if (grade >= 80 ) {
			System.out.println("You received B");
		} else if (grade >= 70) {
			System.out.println("You received C");
		} else if (grade >= 60) {
			System.out.println("You received D");
		} else
			System.out.println("You received F");
		

	}

}
