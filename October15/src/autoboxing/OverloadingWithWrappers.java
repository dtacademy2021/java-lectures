package autoboxing;

public class OverloadingWithWrappers {

	public static void main(String[] args) {


		m1(21L);

	}

//	public static void m1(byte b) {
//
//		System.out.println("byte version");
//
//	}

//	public static void m1(int b) {
//
//		System.out.println("int version");
//
//	}

//	public static void m1(long b) {
//
//		System.out.println("long version");
//
//	}
	
	public static void m1(Integer b) {
		
		System.out.println("Integer Wrapper version");
		
	}
	
//	public static void m1(Byte b) {
//		
//		System.out.println("BYTE Wrapper version");
//		
//	}
	public static void m1(Long b) {
		
		System.out.println("Long Wrapper version");
		
	}
	
	public static void m1(int ...is ) {
		
		System.out.println("int varargs version");
		
	}
	
	

}
