package methods;

import java.util.Arrays;

public class PassByValueExample3 {

	public static void main(String[] args) {
		
		
		// PASS-BY-VALUE
		
		//Java is considered pass-by-value which means when a variable is passed to a method the value(copy) of the variable is passed, not
		// the actual variable itself
		
		int [] anything = {56, 34, 1, 34, 56};
		
		System.out.print("Before method call: ");
		System.out.println(Arrays.toString(anything));
		
		changeArray(anything);
		
		System.out.print("After method call: ");
		System.out.println(Arrays.toString(anything));


	}
	
	
	
	
	public static void  changeArray(int [] arr) {
		
		arr[0] = 999;
		
		System.out.print("Inside the method: ");
		System.out.println(Arrays.toString(arr));
		
	}

}
