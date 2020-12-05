package overloading;

public class Sub extends Super{
	
	
	
	public void m1() {
		System.out.println("M1 Sub");
	}
	
	
	private Object m1(int i){
		System.out.println("M1 with int Sub");
	   return null;
	}
	
	
	
	
	public void  m1(double i){
		System.out.println("M1 with double sub");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	// subclass method1() is entirely independent method from superclass method1()
	// so overrriding rules do not apply for this method
	// Here subclass is simply re-declaring the method with same name in super class
	public void method1() {
		System.out.println("sub class method1");
		
	}
	
	
	
	public static void main(String[] args) {
//		new Sub().m1(3.0);
		
		new Sub().method1();
	//	new Super().method1(); // not going to compile
	}
	
	
	
	

}
