package exceptions;

public class ExceptionDemo {
	
	
	public static void main(String[] args) {
      
		
		
		//to handle exceptional situations in Java,  we use try-catch blocks
		
		int c = 0;
		int a = 9;
		
		int b = 0;
		
//		ArithmeticException e = new ArithmeticException();
		
		
				
		System.out.println("Before exception");
		
//		if(b==0) {
//			System.out.println("You are trying to divide a number by zero. And this is not allowed.");
//			System.out.println("hence, I am terminating this program.");
//			return; // return the execution back to the caller
//		}
		// this scenario must be handled without try catch, using conditionals
		c = a/b;
		try {
			
			
		
			
		}catch(ArithmeticException e) {
			System.out.println("Arithemetic exception happened");
			System.out.println("You are trying to divide a number by zero");
		}
		
		System.out.println(c);
		
		System.out.println("Another 100 tests are going to be executed");
		
		
	}

}
