package arrayOperations;

public class FindLargest {

	public static void main(String[] args) {
		// Find Largest value in an array
		
		int [] numbers = {60, 69, 75, 35, 60, 74, 38, 27, 47, 21};
		
		int max = numbers[0]; // We are going to assume that the first element is the largest
		
		//Use loop to compare the each element with max
		//If the element is greater than the max, update the max
		
		for (int i = 1; i < numbers.length; i++) {  //start with index 1
			
			if(numbers[i] > max) {
				max = numbers[i];
			}
			
		}
		
		System.out.println("The max is: " + max);
		

	}

}
