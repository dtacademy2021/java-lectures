package methods;

public class CallingOverloadedMethods {
	
	public static void main(String[] args) {
		
		short b = 78;
		method((double)78);
		
	}

	public static void method(int beginning) {
		System.out.println("Int");
	
	}
	public static void method(double s) {
		System.out.println("Double");
	}
	
//	public static void method(String st) {
//		System.out.println("String");
//	}
	
	public static void method(short s) {
		System.out.println("Short");
	}
	
	public static void method(float s) {
		System.out.println("Float");
	}
	
	public static void method(long s) {
		System.out.println("Long");
	}
	
	public static void method(byte s) {
		System.out.println("Byte");
	}
	
//	public static void method (Object o) {
//		System.out.println("Object");
//	}
//	
////	public static void method (Double o) {
//		System.out.println("Double");
//	}


	

}
