package cssvag;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		
		
		 System.out.println("This program will display a rectangle based on the input by the user.");
         System.out.println("Please enter the height of the rectangle: ");
         Scanner sc = new Scanner(System.in);
         int height = sc.nextInt();
         System.out.println("Please enter the width of the rectangle: ");
         int width = sc.nextInt();
         
         //Steps to debug:
         // 1. Add a breakpoint at a desired point in a program
         // 2. Right click on a program and Debug As Java Application
         // 3. Switch the view to Debug mode
         // 4. Use Step Over to debug
         // 5. Switch back to Java mode after debugging
        
         
         for (int i = 1; i <= height; i++) {
        	 
        	                
        	 for (int j = 1; j <= width; j++) {
                      if (i == 1  ||  j == 1 || j == width || i == height) {
                             System.out.print("*");
                      } else
                             System.out.print(" ");
                }
                System.out.println();
         }
   }
		// TODO Auto-generated method stub
	
	

	

}
