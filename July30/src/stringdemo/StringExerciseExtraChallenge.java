package stringdemo;

import java.util.Scanner;

public class StringExerciseExtraChallenge {

	public static void main(String[] args) {
		//Extra challenge: I want my program to work with outer String with any even length <<<<>>>>

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter outer string (any even length 2,4,6,8,etc): ");
		String outer = sc.next();
				
		
		
		System.out.println("Enter inner string: ");

		String inner = sc.next();
		
		//Find the middle index
		
		int midIndex = outer.length()/2;
		
		System.out.println(midIndex);
		
		String start = outer.substring(0, midIndex);
//		
		String end = outer.substring(midIndex);
//		
		System.out.println(start + inner + end);
//		
		
		
		

	}

}
