package warmup;

import java.util.Arrays;

public class ArrayExercise1 {

	public static void main(String[] args) {
		// Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
		
		// Ex {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20} --> { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 10}
		
		int [] nums = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		// Write your code here
		// Use swapping to shift elements to left
		//{6, 2, 5, 3}
		//{2, 6, 5, 3}
		//{2, 5, 6, 3}
		//{2, 5, 3, 6}
		
		
		for (int i = 0; i < nums.length-1; i++) {
			
			int temp = nums[i];
			nums[i] = nums[i+1];
			nums[i+1] = temp;
			
		}
		
		System.out.println(Arrays.toString(nums));
		
		



	}

}
