package exceptions;

public class ThrowKeyword {

	public static void main(String[] args) throws Exception {


		String  testResult = "pass";
		
		
		if(testResult.equals("fail")) {
			System.out.println("Test failed");
			throw new TestResultFailException();
		}
		

		// throw vs throws
	//	throw new Exception("Exception happened because of test failure");
		
		
	//	System.out.println(a/b);  // JVM is creating an object and throwing it implicitly
	
		
		
		
//		ArithmeticException a = new ArithmeticException("/ by decimal not allowed");
//		
//		throw a; // I'm explicitly creating an object of ArException and throwing it.
//		
		
		
	System.out.println(divide(3, 0));
		
		
		
		

	}
	
	
	public static double divide(double dividend, double divisor) {
		
		if(divisor==0.0) {
			System.out.println("Division by 0.0 is not allowed");
			throw new ArithmeticException("/ by 0.0");
		}
		
		return dividend/divisor;
		
		
	}

}
