package staticVSdynamicBinding;

public class Tester {
	
	public static void main(String[] args) {
		
		
		//Static binding refers to binding of variables and overloaded methods
		//Dynamic binding refers to binding of overridden methods
		
		
		Parent parent = new Child();
		
		
		System.out.println(parent.i);
		System.out.println(parent.str);
		
		parent.method1();
		
		parent.method1("dsbva");
		
		parent.method2();
		
		parent.method3();
		
		
	}

}
