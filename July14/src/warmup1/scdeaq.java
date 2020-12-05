package warmup1;

import java.util.Scanner;

public class scdeaq {
	
	public static void main(String[] args) {
		
		
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter your first name: ");
		String firstName = sc.next();
		System.out.println("Please enter your last name:");
		String lastName = sc.next();
		System.out.println("Please enter your email");
		String email = sc.next();
		System.out.println("Please enter your phone number: ");
		long phonenumber = sc.nextLong();
		System.out.println("Please enter your address: ");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.println("Please enter your birthday: ");
		String birthday = sc.next();
		System.out.println("Would you like to be on campus or not? True or false:  ");
		boolean campus = sc.nextBoolean();
		System.out.println("Here's the info that you provided:");
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Email: " + email);
		System.out.println("Phone number " + phonenumber);
		System.out.println("Address: " + address);
		System.out.println("Birthday: " + birthday);
		System.out.println("On campus: " + campus);
	}

}
