package methods;

public class MethodExercise2 {

	public static void main(String[] args) {
		// Create a method that has 2 int parameters and prints out the sum of the numbers between them
		
//		
		 printSum(1,10);  //-> 55
		 
		 
		 
		 
		 printSum(20,200);  //-> 19910
		 printSum(20,37);
		 printSum(35,49);
	}
	
	
	public static void printSum(int start, int end) {
		
		int sum = 0;
		
		for (int i = start; i <= end ; i++) {
			
			sum+=i;
			
		}
		
		System.out.println(sum);
		
	}

}
