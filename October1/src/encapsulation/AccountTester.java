package encapsulation;

import java.util.Scanner;

public class AccountTester {
	
	
	
	public static void main(String[] args) {
		
		
		Account a = new Account("Burcu", "123 Main St", "202-123-2345", "sagv@gmail.com", 53264563257L, 3265776326L);
		
		
		// I am currently able to modify any data field directly
		
		

	//	System.out.println(a.getName());
		
		System.out.println(a.getPhoneNo());
		
		a.setPhoneNo("703-567-1234");
		
		System.out.println(a.getPhoneNo());

		


		
		
		
		
	}

}
