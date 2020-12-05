package warmup;

import java.util.Arrays;

public class ReverseStringUsingCharArray {

	public static void main(String[] args) {
		
		
		String str = "There are two ways to write error-free programs; only the third one works";

		char[] elements = str.toCharArray();

		System.out.println(Arrays.toString(elements));
		
		
		for (int i = 0, j = elements.length-1; i < j; i++, j--) {
			
			
			char temp = elements[i];
			elements[i] = elements[j];
			elements[j] = temp;


			
			
		}
		
		System.out.println(elements);
		
		
		
		
		
		String [] names =  new String[2];
		
		
		System.out.println(names[2]);
		
		
		
		
		
		
		

	}

}
