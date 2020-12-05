package methods;

public class MethodExercise {

	public static void main(String[] args) {
		// Create a method that takes a message and prints it given amount of times
		// printMessage("HI", 100);
		// printMessage("Hello World", 10000);
		
//		printHello100Times();
		
//		printMessage("Hi", 1000000);
		
		printMessage("Online people", 10);
		
		
        
	}

	
	public static void printHello100Times() {
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Hello");
		}

	}
	
	public static void printMessage(String msg, int times) {
		
		for (int i = 0; i < times; i++) {
			System.out.println(msg);
		}
		
	}
	
	

}
