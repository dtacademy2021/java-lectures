package arrayOperations;

import java.util.Arrays;

public class RandomShuffle {

	public static void main(String[] args) {
		// Create a program that randomly shuffles (reorders) the elements in an array
		
		int [] nums = {0,1,2,3,4,5,6,7,8,9};
		
		System.out.println(Arrays.toString(nums));
		
		for (int i = nums.length - 1; i > 0 ; i--) {
			
			int j = (int)(Math.random() * (i + 1));
			
			int temp = nums [i];
			nums[i] = nums[j];
			nums[j] = temp;
			
		}
		
		
		System.out.println(Arrays.toString(nums));

	}

}
