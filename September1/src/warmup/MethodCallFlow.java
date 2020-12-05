package warmup;

public class MethodCallFlow {

	public static void main(String[] args) {
		
		
		method1();
		System.out.println("Inside main after call");
		
		


	}

	public static void method1() {
		System.out.println("Inside method1 before call");
		method2();
		System.out.println("Inside method1 after call");
	}

	public static void method2() {
		System.out.println("Inside method2 before call");
		method3();
		System.out.println("Inside method2 after call");

	}

	public static void method3() {
		System.out.println("Inside method 3");
	}

}
