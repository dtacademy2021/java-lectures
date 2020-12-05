package warmup;

public class MethodCallExercise {

	public static void main(String[] args) {
		// Create  2 methods
		// 1. a method that takes an integer as an argument and returns the reversed version
		    
		  //  public static int reverse (int number) {}
		
		// 2. a method that takes an integer and returns true or false if the number is palindrome
				
			//public static boolean isPalindrome (int number) {}
		 
		   // Call reverse() method inside this method to check for palindromicity
		
		//In the main method, call isPalindrome method to test 
		//1234
		
		System.out.println(reverse(1234));
		
		System.out.println(isPalindrome(12321));
		
	}
	
	
	public static int reverse (int number) {
		int reversed = 0;
		
		while(number>0) {
			int lastDigit = number % 10;
			reversed = reversed * 10 + lastDigit;  // "reversed * 10" will add a digit with each loop
			number = number/10;
		}
		
		return reversed;  //  Integer.parseInt(reversed); converts String into an integer
	}
	
	//12322
	public static boolean isPalindrome (int number) {
		
		
		
		if(number == reverse(number)) {
			return true;
		}else
			return false;
		
		
//		return number == reverse(number) ? true : false;  //ternary version
		
	}
	
	
	

}
