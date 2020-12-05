package warmup1;

import java.util.Scanner;

public class Assignment3 {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);	
		
		System.out.println("This program calculates the sum of the digits that you enter!");
		
		System.out.println("Please enter a number between 1-999");
		int userNum = sc.nextInt();
		
		int variableOne = userNum % 10;
		int variableTwo = userNum % 100/10;
		int variableThree = userNum / 100;
		
		int Sum = variableOne + variableTwo + variableThree;
		System.out.println("The sum of the digit is: "+Sum);
	}

}
