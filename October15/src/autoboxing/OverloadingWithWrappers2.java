package autoboxing;

public class OverloadingWithWrappers2 {

//	public static void main(String[] args) {
//
//
//		m1((byte)21);
//
//	}

//
	
//	public static void m1(Integer b) {
//		
//		System.out.println("Integer Wrapper version");
//		
//	}
	
//	public static void m1(String b) {
//		
//		System.out.println("String version");
//		
//	}
//	
//	public static void m1(StringBuilder sb) {
//		
//		System.out.println("StringBuilder version");
//		
//	}
//	
//	public static void m1(long ... is ) {
//		
//		System.out.println("Long varargs version");
//		
//	}
	
//	public static void m1(Object o ) {
//		
//		System.out.println("Object version");
//		
//	}
	
//	public static void m1(long...arr) {
//		System.out.println("varargs");
//		
//	}
	
	public static void m1(Object o) {
		System.out.println("object");
		
	}
	
	
	public static void main(String[]args) {
		
		long[]ar= {1,2,3};
		m1(ar);
//	
	}

}
