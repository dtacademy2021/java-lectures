package warmup;

import java.util.Arrays;

public class ArrayExercise2 {

	public static void main(String[] args) {
//		Given a non-empty array of ints, return a new array containing
//				the elements from the original array that come after the last 4 (a number) in the original array. The original array will contain at least one 4.
//				[2, 4, 1, 2]) → [1, 2]
//				[4, 1, 4, 2]) → [2]
//				[4, 4, 1, 2, 3]) → [1, 2, 3]
		
		int [] nums = {4, 4, 1, 4, 4, 1, 2, 3, 2, 3};
		
		// Steps:
		// Find the index of last 4
		int index = -1; // -1 is used in case the key is not found
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==4) {
				index = i+1; // to locate the first element that starts after the last 4
			}
		}
		
		System.out.println(index);
		
		
		
		// Create  new array and copy the elements after that index
		
		int [] arr2 = new int [nums.length - index];
		
		
		for (int i = 0; i < arr2.length; i++) {
			
			arr2[i] = nums[i + index];
			
		}
		
		
		System.out.println(Arrays.toString(arr2));
		
		
		



	}

}
