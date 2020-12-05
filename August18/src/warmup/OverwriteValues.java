package warmup;

import java.util.Arrays;

public class OverwriteValues {
	
	public static void main(String[] args) {
		
		
		int [] nums = {1,2,3};
		
		int temp = nums[0];
		
		nums [0] = nums[2];
		
		nums[2] = temp;
		
		
		System.out.println(Arrays.toString(nums));
		
		
		
		
		
		
		
		
	}

}
