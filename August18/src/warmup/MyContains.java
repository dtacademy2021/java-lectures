package warmup;

import java.util.Scanner;

public class MyContains {

	public static void main(String[] args) {
		// Given: Leo loves burgers and hamburgers
		// Searched: ger
		//Output: The string "Leo loves burgers" contains "ger"
		//Implement the program using a boolean flag
		
		
		//Pseudocode:
		
		//Use a loop to continuously get a substring with given length
		//As soon as the substring is found stop the search
		//Print out if the substring is found or not
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		System.out.println("Enter a serached substring: ");
		String sub = sc.nextLine();
		int subLength = sub.length();
		
		//Use a loop to continuously get a substring with given length
		//As soon as the substring is found stop the search
		//Print out if the substring is found or not
		
		boolean isFound = false;
		int indexOfSub = -1; // if not found it returns -1
		
		for (int i = 0; i < str.length()-subLength; i++) {
			
		      if(str.substring(i, i+subLength).equals(sub)) {
		    	  isFound = true;
		    	  indexOfSub = i;
		    	  break;
		      }
			
		}
		
	
		System.out.println(sub + " is " + 	(isFound ? "found" : "not found") + " at index " + indexOfSub);
		
		
		
				

		

		
		
	}

}
