package warmup;

import java.util.Scanner;

public class FahrenheitToCelcius {

	
	/**
	 * 
	 * 
	 * 
	 * This is a comment for main method*/
	public static void main(String[] input) {

		//		Write a program that converts a Fahrenheit degree to Celsius using the formula 
//			celsius = (5/9)*(fahrenheit - 32)
		
		
		//Get the fahrenheit from the user
		System.out.print("Please enter the fahrenheit to calculate the celcius: ");
		Scanner sc = new Scanner(System.in);
		
		double fahrenheit = sc.nextDouble();
		
		
		//Calculate the celsius based on the formula -> celsius = (5/9)*(fahrenheit - 32)
		
		double celsius = (5 / 9.0)*(fahrenheit - 32);
		
		//Display the result to the user
		
		System.out.println(fahrenheit + "F is " + celsius + "C in Celsius");
		
		
		long cc = 7342_76437_673862L;
		
		
		// dvsvhdshbdshbcdsbhjbdsbchjd -> single line comment
		/*snsvavhsvvsxbvbsabnvsavxsa*/  // multi line comment
		/****dsbmcsbabcdnsbmnbs************************/ //javadoc comment
		
		


	}
	
	public static void m1() {
		main(new String[] {});
	}

}
