package staticVSdynamicBinding;

public class Parent {
	
	// static/private/final  methods are bound during compile-time 
	// static/private/final  methods use static binding
	int i = 67;
	
	String str = "Java";
	
	
	public void method1() {
		System.out.println("Parent m1 no arg");
	}
	
	
	public void method1(String str) {
		System.out.println("Parent m1 String arg");
	}
	
	
	public void method2() {
		System.out.println("Parent m2 no arg");
	}
	
	
	public static void method3() {
		System.out.println("Parent m3 no arg");
	}
	
	private void method4() {
		System.out.println("Parent m4 no arg");
	}
	
	public final void method5() {
		System.out.println("Parent m5 no arg");
	}
	
	
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.method4();
		parent.method5();
	}

}
