package warmup;

public class MethodCallingAnotherMethod {

	public static void main(String[] args) {


		printRandomString(25, 20);

	}
	
	
	
	
 	public static void printRandomString (int length, int times) {
 		
 		
 		for (int i = 0; i < times; i++) {
 			
 			RandomString.printRandom(length);
			
		}
 		
 	}

}
