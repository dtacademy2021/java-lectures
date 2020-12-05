package recursion;

import java.util.ArrayList;

public class OutOfMemoryErrorDemo {
	
	
	
	// this error is related to heap space being full
	 
	
	
	public static void main(String[] args) {
		
		
		ArrayList<String> a = new ArrayList<>();
		
		//java.lang.OutOfMemoryError: Java heap space
		
		while(true) {
			 a.add("SomeString");
		 }
		
		
		
	}
	

}
