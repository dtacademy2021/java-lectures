package variables;

public class Child extends Parent{
	
	
	int i ;
	static protected String str ;
	private double d = 5.6;
	
	float f = 23;
	
	
	public void m1() {
		System.out.println("i is " + this.i);
		System.out.println("str is " + this.str);
		System.out.println("d is " + this.d);
	}
	
	
	
	
	public static void main(String[] args) {
		new Child().m1();
		
	}

}
