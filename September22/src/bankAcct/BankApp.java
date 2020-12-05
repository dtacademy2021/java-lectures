package bankAcct;

public class BankApp {

	public static void main(String[] args) {

		BankAccount account1 = new BankAccount();

		System.out.println(account1.getInfo());

		BankAccount account2 = new BankAccount("Fuad");

		System.out.println(account2.getInfo());

		BankAccount account3 = new BankAccount("Furkan", "123 main st", "123456578", "213654312");

		System.out.println(account3.getInfo());
		
		
		
		BankAccount account4 = new BankAccount("Nastya", "123 mains ts", "273567512", "2157127", 
				                   326121675621L, 24133215443L, 200) ;
		
		System.out.println(account4.getInfo());
		
		account4.deposit(200150);
		
		System.out.println(account4.getBalance());
		
		account4.withdraw(200350);
		
		
		System.out.println(account4.getInfo());
		
		account4.withdraw(100000);
		
		
		
		
		
		
		
		
		
		

	}

}
