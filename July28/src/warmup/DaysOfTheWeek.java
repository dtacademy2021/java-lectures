package warmup;

import java.util.Scanner;

public class DaysOfTheWeek {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number (0-6) and I will display the corresponding day of the week: ");
		int day = sc.nextInt();

		switch (day) {
		
		default:
			System.out.println("Invalid entry");
		
		case 0:
			System.out.println("Sunday");

		case 1:
			System.out.println("Monday");
			
		case 2:
			System.out.println("Tuesday");

		case 3:
			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("Thursday");

		case 5:
			System.out.println("Friday");
			break;

		case 6:
			System.out.println("Saturday");

		

		}

	}

}
