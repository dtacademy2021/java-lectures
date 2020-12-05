package warmup1;

import java.util.Scanner;

public class MilesToKilometersConvereter {

	public static void main(String[] args) {
		//1. Get the miles from the user
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to MILES to KILOMETERS Converter");
		System.out.print("Please enter the miles: ");
		double miles = sc.nextDouble();
		//2. Declare and initialize a constant KILOMETERS_PER_MILE with value 1.609
		final double KILOMETERS_PER_MILE = 1.609;
		
		//3. Calculate the kilometers by formula -> miles*KILOMETERS_PER_MILE
		
		double result = miles*KILOMETERS_PER_MILE;
		
		//4. Display the result
		
		System.out.println( miles + " miles is "+ result + " kilometers");

		
		
		
		
		
	}

}
