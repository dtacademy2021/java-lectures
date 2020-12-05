package arrayOperations;

public class ArrayExercise2 {

	public static void main(String[] args) {
		//Given an array of ints, return true if 6 appears as either the first or last element in the array.
//		
//		[1, 2, 6] → true
//		[6, 1, 2, 3] → true
//		[13, 6, 1, 2, 3] → false
		
		
		int [] nums = {13, 6, 1, 2, 3};
		
		
		if(nums [0] == 6 || nums [nums.length-1] == 6) {
			System.out.println("True");
		}else
			System.out.println("False");
		

	}

}
