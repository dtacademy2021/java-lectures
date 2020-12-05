package arrays;

import java.util.Arrays;

public class ArrayReferences {

	public static void main(String[] args) {


		int [] a = {1,2,3,4,5};
		
		int [] b = {56,33,11,23,32,43,45,564,56,57};
		
		String [] c = {"Elena" , "Fuad"};
		String [] d = {"Furkan" , "Isa"};
		
		
		
		
		a = b;
		
		d = c;
		

		
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
		
		
		int a1 = 4;
		int b1 = 8;
		
		a1 = b1;
		
		

		
		
		
		

	}

}
