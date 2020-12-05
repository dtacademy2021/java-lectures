package arrayOperations;

public class FindIndexOfSmallest {

	public static void main(String[] args) {
		// Given an array of ints find the index of the smallest number
		
		int [] numbers = {12, 69, 75, 35, 12, 74, 38, 12, 47, 21};
		
		int min = numbers[0];
		int indexOfMin = 0;
		
		for (int i = 1; i < numbers.length; i++) {
			
			if(numbers[i] < min) {
				min = numbers[i];
				indexOfMin = i;
			}
			
		}
		
		System.out.println("The minimum is: " + min + " the index is " + indexOfMin);
		
		

	}

}
