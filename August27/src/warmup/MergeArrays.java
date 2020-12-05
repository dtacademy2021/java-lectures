package warmup;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {

//		Given 2 int arrays
//	
//		int [] nums1 = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//		int [] nums2 = {30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
//
//		Merge the array into one
//		
//		Fill the last 5 slots with 0
//	
//		Find the index of value 38

		int[] nums1 = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int[] nums2 = { 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };

		int[] nums3 = new int[nums1.length + nums2.length];

		System.out.println(Arrays.toString(nums3));

		for (int i = 0; i < nums3.length; i++) {
			if (i < nums1.length)
				nums3[i] = nums1[i];
			else
				nums3[i] = nums2[i - nums1.length];

		}

		System.out.println(Arrays.toString(nums3));
		
		Arrays.fill(nums3, nums3.length-5, nums3.length, 0);
		
		System.out.println(Arrays.toString(nums3));
		
		int searchVal = 38;
		
		Arrays.sort(nums3);
		System.out.println(Arrays.toString(nums3));
		
	    int retVal = Arrays.binarySearch(nums3,searchVal);
	    System.out.println("The index of element " + searchVal + " is " + retVal);
		
		
		
		
		
		
		

	}

}
