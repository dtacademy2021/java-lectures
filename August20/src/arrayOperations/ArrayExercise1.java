package arrayOperations;

import java.util.Arrays;

public class ArrayExercise1 {

	public static void main(String[] args) {
	 //Create an array of 100 random integers between 25 and 75. 
	//And get the sum of all numbers that are divisible by 2 or 3 but not by both in that array
		
		int [] nums = new int [100];
		
		System.out.println(Arrays.toString(nums));
		
		
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			
			nums[i] = 25 + (int) (Math.random()*51);
			
			if (nums[i] % 2 == 0 ^ nums[i] % 3 == 0) {
				sum += nums[i];
			}
			
		}
		
		System.out.println(Arrays.toString(nums));
		System.out.println(sum);
		

	}

}
