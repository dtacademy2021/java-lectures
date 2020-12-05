package game;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class StringExercise7 {

	public static void main(String[] args) {
//		Given a String with multiple words extract the required word.
//      Extract the day of the week
//      Extract the month		
		
		
		
		String a = "Saturday August 01 14:26:59 EDT 2020";
		
		int firstSpaceIndex = a.indexOf(" ");
		
		
		
		String weekday = a.substring(0, firstSpaceIndex);
		
		System.out.println(weekday); // to get the weekday

		
		int secondSpaceIndex = a.indexOf(" ", firstSpaceIndex+1);
		
		
//		
		String month = a.substring(firstSpaceIndex + 1, secondSpaceIndex);
		
		System.out.println(month);
		
//Extract date
		int thirdSpaceIndex = a.indexOf(" ", secondSpaceIndex+1);
		
		
		String date = a.substring(secondSpaceIndex + 1, thirdSpaceIndex);
		
		System.out.println(date);
		
		
	// Extract EDT, there is easier way -> 	use lastIndexOf()
		int lastSpaceIndex = a.lastIndexOf(" ");
		int secondLastSpaceIndex = a.lastIndexOf(" ", lastSpaceIndex-1);
		
		String edt = a.substring(secondLastSpaceIndex +1 , lastSpaceIndex);
		
		System.out.println(edt);
		
		
	 
		
	}

}
