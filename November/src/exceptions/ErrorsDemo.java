package exceptions;

public class ErrorsDemo {

	public static void main(String[] args) {

		
		
		//Error is a subclass of Throwable that represents system/hardware/performance/ related failures
		// StackOverflowError(stack), OutOfMemoryError(heap)
	//	Error e = new Error();
		
		
		try {
			method();
		} catch (Error e) {
			System.out.println("Handling an error...not");
		}
		
		
		

	}
	
	
	public static void method() {
		method();
	}
	

}
