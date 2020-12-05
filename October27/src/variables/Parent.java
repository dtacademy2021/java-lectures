package variables;

public  class Parent {
	
	
	 int i = 1; 
	static protected String str = "Hello";
	private double d = 3.4;
	
	static float f = 8;
	
	// private variables are not hidden but can be re-declared
	// in a subclass and two variables are independent variables that do not hide each other
	
	
	 public void m1() {
		System.out.println("i is " + i);
		System.out.println("str is " + str);
		System.out.println("d is " + d);
	}
	
	private class Responsibilty {
		
	}
	
	

}
