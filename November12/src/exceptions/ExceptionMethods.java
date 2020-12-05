package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionMethods {
	
	 public static void main(String[] args) throws FileNotFoundException {
		
		 
		 
		 try {
			FileInputStream fi = new FileInputStream("C:\\Users\\Duotech\\Desktop\\fil.txt");
			//throw new FileNotFoundException();
		} catch (FileNotFoundException e) {
			
////			System.out.println(e.getMessage());
//			System.out.println(e.toString());
			e.printStackTrace();
			System.out.println("Hello");
		}
		 
		 System.err.println("After try catch block");
		 
	}

}
