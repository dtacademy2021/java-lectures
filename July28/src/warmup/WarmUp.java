package warmup;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		//Needs to be older than 25 and younger than 40
		// and has to be either rich (income>100,000) or good looking (looks > 8.5
		//Console output:
		// How old are you? : 
		// What is your yearly income?:
		//How handsome are you on the scale of 1 to 10? : 
		// If everything is good >>> Great, You are eligible to date my granddaughter
		// else >>> Sorry, you can come back later.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your age: ");
		
		int age = sc.nextInt();
		
		System.out.println("Please enter your income: ");
		
		double income = sc.nextDouble();
		
		System.out.println("Please enter your scale of handsomness (1-10): ");
		
		double looks = sc.nextDouble();
		
		
		boolean isEligible = (age>=25 && age<=40) && (income > 100000 || looks > 8.5);
		
		
		if(isEligible) {
			System.out.println("Congrats! You can marry my granddaughter");
		}else {
			System.out.println("Sorry, come back later.");
		}

	}

}
