package warmup;

import java.util.Arrays;

public class Initialize2DArrayWithRAndomVAlues {

	public static void main(String[] args) {
		
		
		int [][] nums = new int [5][8];
		
		
//		System.out.println(Arrays.deepToString(nums));
		int sum =0;
		
		for (int i = 0; i < nums.length; i++) {
			
			
			for (int j = 0; j < nums[i].length; j++) {
				
				nums[i][j] = (int)(Math.random()*100);
				sum += nums[i][j];
				System.out.print(nums[i][j] + "\t");
				
			}
			System.out.println();
			
		}
		
		
		System.out.println(sum);

	}

}
