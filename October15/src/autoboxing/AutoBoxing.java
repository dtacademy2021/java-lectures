package autoboxing;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxing {

	public static void main(String[] args) {


		List<Double> nums = new ArrayList<>();
		
		nums.add(new Double("23.01"));
		
		//Java 5 introduced autoboxing of primitives into Wrapper types 
		//  and auto-unboxing of Wrapper types into primitives
		
		nums.add(34.9); //  Auto boxing -> new Double(34.9)
		
		double d = 89.1; 
		
		nums.add(d); // Autoboxing 
		
		
		System.out.println(nums);
		
		
		for (int i = 0; i < nums.size(); i++) {
			
			System.out.println(nums.get(i).getClass());
			
		}
		
		
		
		Integer i = new Integer(23);
		
	//	Integer i1 = 34.6;
		Double d1 = 67.9;
		
	//	Double d2 = 67; //	compilation error -> 
		//is equal to ->	Double d2 = new Integer(67);  // Since Double and Integer are unrelated classes 
		
//		byte b2 = 6;
//		int it = b2;
		
//		Byte b = 4;
//		
//		Integer i2 = b ; // With Wrappers there is no concept of smaller type being assignable to larger as we can do with primitives
		
		Boolean b = true;
		
	//	char ch = 45;
		
		Character ch = 45;  // With Character class we are able to assign primitive int which will assign its Ascii value
		
		System.out.println(ch);
		
		
		
		
		
		
	}
	
	

}
