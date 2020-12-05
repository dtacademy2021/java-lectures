package arraylist;

import java.util.Arrays;

public class ArrayTester {

	public static void main(String[] args) {

			
		
	
		Contact [] arr = new Contact [10];  // It only creates empty slots that can accept Contact objects
		
		System.out.println(Arrays.toString(arr));
		
		Contact c1 = new Contact("Nihal", "2012349756", "nihal@gmail.com", "123 Main st");
		
	
		
		arr[0] = c1;
		
		System.out.println(Arrays.toString(arr));
		
		arr [1] = new Contact("Furkan", "201234934", "furkan@gmail.com", "123 Fair st");
		
		System.out.println(Arrays.toString(arr));
		
//		Contact [] arr1 = {new Contact("Furkan", "201234934", "furkan@gmail.com", "123 Fair st"), 
//							new Contact("Nihal", "2012349756", "nihal@gmail.com", "123 Main st"),
//							c1 };
		
		System.out.println(c1);
		
		

	}

}
