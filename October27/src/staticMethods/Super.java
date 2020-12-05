package staticMethods;

public  class Super {
	
	final int i  = 0;
	
	String s;
	
	public static void method1() {
		System.out.println("Super method1");
	}
	
	
	public static void method2() {
		System.out.println("Super method1");
	}
	//All four rules over overriding applies to static methods
	// plus static method cannot be overriden by instance
	// and vice versa
	
	
	public static void method3() {
		System.out.println("Super method1");
	}
	
	public static void method4() {
		System.out.println("Super method1");
	}
	
	
	// making a method final means that method cannot be overriden
	// in a subclass
	public final void method5() {
		System.out.println("method5");
		String s;
	}
	
	

}
