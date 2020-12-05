package arrays;

import java.util.Arrays;

public class CopyArrays {

	public static void main(String[] args) {
		// Copy contents of an array to another array
		
		
		int [] b = {56,33,11,23,32,43,45,564,56,57,56};
		
		
		int [] c = new int [b.length];
		
		for (int i = 0; i < c.length; i++) {
			
			c[i] = b[i];
			
		}
		
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));

	}

}
