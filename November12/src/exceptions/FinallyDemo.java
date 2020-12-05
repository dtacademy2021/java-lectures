package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FinallyDemo {
	
	public static void main(String[] args) throws IOException {
		
		
		// finally block/clause -> an optional block that is executed regardless of whether an exception is thrown in try block
		FileInputStream fi = null;
		
		try {
			System.out.println("Before exception");
			 fi = new FileInputStream("C:\\Users\\Duotech\\Desktop\\file.txt");
			System.out.println("After exception");
			//method(); StackOverflowError and OutOfMemoryerror is not going to crash the JVM thus not going to prevent finally block execution
			System.exit(0); // End the java program 
			//return; // return does not prevent finally block from being executed
		} catch (FileNotFoundException e) {
			System.out.println("Catch block logic");
		//	e.printStackTrace();
			
		} finally {  // Only JVM crash and System.exit() can stop finally block from being executed 
			System.out.println("Finally block logic");
			fi.close();
		}
		
		
//		try {
//			
//		} catch (Throwable t)  {  //an exception type must be a subclass of Throwable
//			// TODO: handle exception
//		}finally {
//			
//		}
		
		
	}
	
	
	public static void method() {
		method();
	}

}
