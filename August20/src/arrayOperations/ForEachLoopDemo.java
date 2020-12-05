package arrayOperations;

import java.util.Arrays;

public class ForEachLoopDemo {
	
	
	public static void main(String[] args) {
		
		
		int [] nums = {0,1,2,3,4,5,6,7,8,9};
		String [] names =  {"Burcu", "Fatih", "Isa"};
		
//		for (int i = 0; i < nums.length; i++) {
//			System.out.print(nums[i] + " ");
//		}
		
		
		//For Each/Enhanced For loop -> mainly used to iterate through all elements of the collection
		// from the beginning till the end without using an index
		
//		for (int e : nums) {    // syntax ->  for (typeOfElement name : nameOfArray)
//			System.out.println(e);
//		}
//		
//		for (String each  : names) {
//			System.out.println(each);
//		}
		
		//Advantages: 
		// No need for index
		// No off-by-one errors or errors related to indexes at all
		//Concise syntax
		//Added with Java 1.5
		
		//Disadvantages
		// Index related actions cannot be done
		// Cannot traverse in reverse order
		// Cannot do actions that change the values of the elements in an array
		
		
//		for (int i = 0; i < nums.length; i++) {
//			
//			nums[i] = 99;
//			
//		}
		
		
//		for (int number : nums) {   
//			
//			
//			
//			number = 99;
//			
//			
//			
//		}
		
		
		
		System.out.println(Arrays.toString(nums));
		
		
		
		
	}

}
