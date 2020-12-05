package methods;

public class PassByValueExample {

	public static void main(String[] args) {
		
		
		// PASS-BY-VALUE
		
		//Java is considered pass-by-value language which means when a primitive variable (or immutable object reference )
		// is passed to a method the value(copy) of the variable is passed, not
		// the actual variable itself
		//
		// With mutable objects such as array or StringBuilder, the changes made in the other methods are reflected in the calling method
		
		double d = 78.8;
		
		int number  = 78;
		System.out.print("Before method call: ");
		System.out.println(number);
		
		incrementByOne(number);
		
		System.out.print("After method call: ");
		System.out.println(number);


	}
	
	
	
	
	public static void  incrementByOne(int a) {
		
		a++;
		System.out.print("Inside the method: ");
		System.out.println(a);
		
	}

}
