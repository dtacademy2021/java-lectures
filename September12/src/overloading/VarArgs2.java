package overloading;

import java.util.Arrays;

public class VarArgs2 {

	public static void main(String [] args ) {
		
			method1(new String[] {"Jamoliddin", "Nastya"});


	}

	public static void method1(String ... words) {
		System.out.println(words[0] + " " + words[1]);
	}
	
//	public static void method1(String [] words) { // cannot override String ... with String []  
//		
//	}

	
}
