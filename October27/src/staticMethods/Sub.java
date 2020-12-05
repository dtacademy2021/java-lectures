package staticMethods;

public class Sub extends Super{
	
		
 //Can static methods be overridden?
// No, they can be only hidden
	
//	public static void method1() {
//	System.out.println("Sub method1");
//}
	
//	static void method2() {
//		System.out.println("Super method1");
//	}
	
	
//	public  void method3() {
//		System.out.println("Super method1");
//	}
	
	
	
	
//	@Override 
	public static void method4() {
		System.out.println("Super method1");
	}
	
	
	
	public static void main(String[] args) {
		
		
		method1();
		method1();
		
	}
	
	
	
	
	

}
