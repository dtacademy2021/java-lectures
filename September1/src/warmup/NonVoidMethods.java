package warmup;

import java.util.Arrays;
import java.util.Scanner;

public class NonVoidMethods {
	
	
	
	public static void main(String[] args) {
		
	
		 System.out.println(max(200, 200));
		 
		 
		 
		char result = getGrade(61);
		 
		printGrade(66);
		
		getGrade(23); // returned value is discarded after this line
		
		
		
//		if (result == 'D') {
//			System.out.println("You failed the course because the minimum grade to pass is C");
//			System.out.println("Your grade is " + result );
//		}
		 
		 
		double d = Math.random();
		
		Arrays.sort(new int [] {3,2,1});
		
	
		int index =	Arrays.binarySearch(new int [] {3,2,1}, 1);
		
		
		
		System.out.println(Math.random());
		
		System.out.println(getGrade(45));
		
//		System.out.println(printGrade(34)); compiler error since printGrade() is not returning any value
		
		
		divide(9, 0);
		
		System.out.println("After divide method");
		
		
		
		
		
		
		
		
	}
	
	
	
	/*
	 * Methods that return value need to have a return keyword
	 * The returned value must be compatible/assignable with the return type defined in the method
	 * 
	 */
	
	
	public static int max (int a, int b) {
				
		if(a>b) {
			return a;
		}else
			return b;
		
				
	}
	
	
	public static double method1 (int a, int b) {
		
		float sh = 45;

		return sh ;
		
	}
	
		public static String method2 (int a, int b) {
		
		

		return new String("bsdvavdscavbsa") ;
		
	}
		
		
		public static int[] method3 (int a, int b) {
			
			int [] arr = new int [5];

			return arr ;
			
	}
		
		
		/*
		 * Try not to have multiple return statements
		 * Instead assign the value based on the condition and have a single return statement at the end of your method
		 * 
		 */
		
		public static char getGrade(double score) {
			char gr;
			
			if(score>=90) {
				gr =  'A';
			}else if(score>=80) {
				gr = 'B';
			}else if(score>=70) {
				gr = 'C';
			}else if(score>=60) {
				gr = 'D';
			}else {
				gr = 'F';
			}
			
			
			
			return gr;
			
		}
		
		
		public static void printGrade(double score) {
			
			
			if(score>=90) {
				System.out.println( 'A');
			}else if(score>=80) {
				System.out.println( 'B');
			}else if(score>=70) {
				System.out.println( 'C');
			}else if(score>=60) {
				System.out.println( 'D');
			}else {
				System.out.println( 'F');
			}
			
			
			
			
			
		}
		
		/*
		 * The decison to make your method void or value-returning/non-void is up to the programmer
		 */
	
		
		
		public static void divide(int a, int b) {
			
			
		if(b==0) {
			System.out.println("Division by zero is not allowed");
			return; // returns the execution back to the main method if the divisor is 0
		}
			
		System.out.println("The division of " + a + " and " + b + " is " + a/b);	
			

			
			
			
		}
	
	

}
