package arrayOperations;

import java.util.Arrays;
import java.util.Scanner;

public class InitializeWithRandomInts {

	public static void main(String[] args) {
		// Create an array with random numbers in the range of 1-sizeOfAnArray
		//Get the size of an array from  the user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();
		
		int [] numbers = new int[size];
		
		for (int i = 0; i < numbers.length; i++) {
			
			numbers [i] = 1 + (int)(Math.random() * size);
			
		}
		


		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		
		
		

	}

}
