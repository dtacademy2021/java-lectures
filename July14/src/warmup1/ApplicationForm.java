package warmup1;

import java.util.Scanner;

public class ApplicationForm {

	public static void main(String[] args) {
		
		
		
		//Create a Scanner object
		
		
		Scanner scanner = new Scanner(System.in);
		
		//Prompt the user to enter necessary information and store it in a correct variable
		
		System.out.print("Please enter your first name: ");
		String firstName = scanner.next();
		
		System.out.print("Please enter your last name: ");
		String lastName = scanner.next();
		
		System.out.print("Please enter your email: ");
		String email = scanner.next();
		
		System.out.print("Please enter your phone: ");
		long phoneNo = scanner.nextLong();
		
		System.out.print("Please enter your address: ");
		scanner.nextLine(); // this additional nextLine() is required when you use nextLine() after any of the next methods
		String address = scanner.nextLine();
		
		System.out.print("Please enter your birthdate: ");
		String birthdate = scanner.next();
		
		
		System.out.print("Please enter true if you would like to attend classes online, enetr false otherwise: ");
		boolean isOnline = scanner.nextBoolean();
		
		//Display the stored info back to the user
		
		System.out.println("Here's the info that you provided: ");
		System.out.println("First name: "+ firstName+ "\n" + 
				"Last Name: "+lastName );
		
		System.out.println("Email: "+ email);
		System.out.println("Phone: "+ phoneNo);
		System.out.println("Address: "+ address);
		System.out.println("Birthdate: "+ birthdate);
		System.out.println("Online: "+ isOnline);

		
		
		

	}

}
