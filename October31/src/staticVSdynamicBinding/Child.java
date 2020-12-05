package staticVSdynamicBinding;

public class Child extends Parent{
	
	
	int i = 323;
	
	String str = "Python";
	
	
	public void method1() {
		System.out.println("Child m1 no arg");
	}
	
	
	public void method1(String str) {
		System.out.println("Child m1 String arg");
	}
	
	public static void method3() {
		System.out.println("Child m3 no arg");
	}
	
	
	private void method4() {
		System.out.println("Child m4 no arg");
	}
	
	
	
	
}
