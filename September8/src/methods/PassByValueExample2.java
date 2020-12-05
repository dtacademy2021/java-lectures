package methods;

public class PassByValueExample2 {

	public static void main(String[] args) {
		
		
		// PASS-BY-VALUE
		
		//Java is considered pass-by-value which means when a variable is passed to a method the value(copy) of the variable is passed, not
		// the actual variable itself
		
		String str = "Dilmurod";
		System.out.print("Before method call: ");
		System.out.println(str);
		
		changeName(str);
		
		System.out.print("After method call: ");
		System.out.println(str);


	}
	
	
	
	
	public static void  changeName(String name) {
		
		name = name.toUpperCase();
		System.out.print("Inside the method: ");
		System.out.println(name);
		
	}

}
