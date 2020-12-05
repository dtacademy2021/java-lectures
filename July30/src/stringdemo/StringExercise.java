package stringdemo;

import java.util.Scanner;

public class StringExercise {

	public static void main(String[] args) {
		// Given 2 strings ""  and "Hello" , write a program that prints out "^^Hello??"
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter outer string (4 characters, e.g <<>>): ");
		String outer = sc.next();
		
		System.out.println("Enter inner string: ");

		String inner = sc.next();
		
		
		String start = outer.substring(0, 2);
		
		String end = outer.substring(2);
		
		System.out.println(start + inner + end);
		
		//Extra challenge: I want my program to work with outer String with any even length <<<<>>>>
		
		
		

	}

}
