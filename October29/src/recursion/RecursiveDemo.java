package recursion;

public class RecursiveDemo {
	
	
	
	
	public static void main(String[] args) {
		
	//	System.out.println(factorial(5));
		
		m1();
		
	}
	
	public static void m1() { //java.lang.StackOverflowError
		m1();
	}

	
	// How to implement a method to calculate a factorial of a number using recursion?
	
	
	public static int factorial (int n) {
		
		if(n==0) {
			return 1;
		}else {
			return n * factorial(n-1);
		}
		
	}
	
	// finding if a number is a prime number
	// "ABC" -> BAC ACB CAB BAC 
	
	
}
