package immutability;

import java.util.Scanner;

public class AccountImmutableTester {
	
	
	
	public static void main(String[] args) {
		
		
		AccountImmutable a = new AccountImmutable("Burcu", "123 Main St", "202-123-2345", "sagv@gmail.com", 53264563257L, 3265776326L);
		
		
	//	a.setPhoneNo("703-567-1234");
		
		
		System.out.println(a.getInfo());
		
		
		changeAccount(a);
		
		
		System.out.println(a.getInfo());
		
		


		
		
		
		
	}
	
	public static void changeAccount(AccountImmutable acct) {
		
		acct = new AccountImmutable("Nastya", "32 Main St", "202-3132123", "s24324324v@gmail.com", 23432423432L, 43243232434L);
		
		
	}

}
