package methods;

public class AmbiguousCall {

	public static void main(String[] args) {

		method(1, 1); //The method method(int, double) is ambiguous 
		
//		method(1.0, 1.0); //The method method(int, double) is ambiguous 
		
		
		
		
		

	}

//	public static void method(int i, double y) {
//
//		 System.out.println("int double");
//	}

	public static void method(double y, int i) {
		
		 System.out.println("double int");

	}
	
	public static void method(double y, double i) {
		
		 System.out.println("double double");

	}

}
