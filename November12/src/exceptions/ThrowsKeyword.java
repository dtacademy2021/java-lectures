package exceptions;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;

public class ThrowsKeyword {

	public static void main(String[] args) throws IOException{
		
		
		method1();



	}
	
	
	
	
	public static void method1() throws IOException  {   // one method can throw multiple exceptions
		

		//handle or declare
		
		
		
//			try {
//				FileInputStream fi = new FileInputStream("C://User//Desktop//file.txt");
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	
		
		
//		declaring that method throws an exception is simply 
//		FileInputStream fi = new FileInputStream("C://User//Desktop//file.txt");
		
		
			throw new IOException();
		
			
			
		 
		
		// throws IOException explicitly
		
		
		
	}

}
