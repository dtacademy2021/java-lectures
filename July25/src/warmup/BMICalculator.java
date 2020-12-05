package warmup;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		// Get the user's height in meters. E.g, 1.78 for 178 cms
		//Get the user's weight in kgs: 90
		//Calculate the BMI by this formula: BMI = weight/(height*height)
		//Use multiway if-else to display the correct message for each BMI category
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your height in meters: ");
		
		double height = sc.nextDouble();
		
		System.out.println("Please enter your weight in kgs: ");
		
		double weight = sc.nextDouble();
		
		double bmi = weight/(height*height);
		
		System.out.println("The BMI is " + bmi);
		
		if (bmi < 18.5) {
			System.out.println("You are underweight");
		}else if (bmi < 25) {
			System.out.println("You are normal");
		}else if(bmi < 30) {
			System.out.println("You are overweight");
		}else
			System.out.println("You are obese");

		

	}

}
