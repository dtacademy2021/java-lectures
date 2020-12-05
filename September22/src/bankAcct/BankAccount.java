package bankAcct;

public class BankAccount {
	
	//FIELDS: 
	
	String name;
	String address;
	String ssn;
	String phoneNo;
	long accountNo;
	long routingNo;
	double balance;
	
	
	
	//CONSTRUCTORS:
	
//	 a) no-arg -> initializes all fields with some deafult values
	public BankAccount() {
		name = "John Doe";
		address = "123 main st";
		ssn = "1234567890";
		phoneNo = "123-345-3456";
		accountNo = 123456789123L;
		routingNo = 123456789;
		balance =  100;
		
	}
	
//	 b) with one parameter -> initializes only the name
	public BankAccount(String newName) {
		
		name = newName;
		
	}
	
//	 c) with four parameters -> initializes name, address , ssn, phoneNo;
	public BankAccount(String newNeme, String newAddress, String newSSN, String newPhone) {
		name = newNeme;
		address = newAddress;
		ssn = newSSN;
		phoneNo = newPhone;
	}
	
	
	
	
	
	
//	 c) with seven parameters -> initializes all fields;
	public BankAccount(String newNeme, String newAddress, String newSSN, String newPhone, 
			           long newAcct, long newRouting, double newBalance) {
		name = newNeme;
		address = newAddress;
		ssn = newSSN;
		phoneNo = newPhone;
		accountNo = newAcct;
		routingNo = newRouting;
		balance = newBalance;
		
		
	}	
	
	
	
	
	
	//METHODS:
	
	/**
	 * return all the info about the bank account object as a String
	 */
	public String getInfo() {
		return  "NAME: " + name + "\n" +
				"ADDRESS: " + address + "\n" +
				"SSN: " + ssn + "\n" +
				"PHONE: " + phoneNo + "\n" +
				"ACCOUNT NO: " + accountNo + "\n" +
				"ROUTING NO: " + routingNo + "\n" +
				"BALANCE: " + balance + "\n";
				
	}
	
	/**
	 * returns the balance of the account
	 */
	public double getBalance() {
		return balance;
	}
	
	
	/**
	 * increases the balance by the given amount
	 */
	public void deposit(double amount){
		balance = balance + amount;
	}
	
	/**
	 * decreases the balance by the given amount
	 */
	public void	withdraw(double amount) {
		
		
		if(amount<=balance) {
			balance = balance - amount;	
			
		}else {
			
			System.out.println(
					"INSUFFICIENT FUNDS. " + "YOU ARE TRYING TO WITHDRAW " + amount + 
					   ". YOUR BALANCE IS " + balance);
		}
		
	}

	
	
	
	

}
