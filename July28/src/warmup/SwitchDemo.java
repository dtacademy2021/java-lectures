package warmup;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the day: ");
		String day = sc.next();
		
		day = day.toLowerCase(); // To make the user input all lowercase
		
		switch (day) {
		
			case "monday":
				
			case "tuesday":
				
			case "wednesday":
				
			case "thursday":
				System.out.println("Time to work");
				break;
			case "friday":
				System.out.println("Nearing weekend");
				break;
			case "saturday":
				
			case "sunday":
				System.out.println("Weekend");
				break;
			
		
		}
		
		
		
		
		
	}

}
