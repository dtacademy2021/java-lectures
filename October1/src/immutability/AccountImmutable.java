package immutability;

import java.util.Scanner;

public class AccountImmutable {
	
	private String password;
	private String name;
	private String address;
	private String phoneNo;
	private String email;
	private long accountNo;
	private long routingNo;
	private static int noOfAccounts;
	private static final String bankName = "Capital One LLC";
	private boolean onlineAcct;
	
	
	
	
	public boolean isOnlineAcct() {
		return onlineAcct;
	}




	




	public AccountImmutable(String name, String address, String phoneNo, String email, long accountNo, long routingNo) {
		this.password = "abc123";
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
		this.email = email;
		this.accountNo = accountNo;
		this.routingNo = routingNo;
		noOfAccounts++;
	}
	
	


	public String getInfo() {
		return "Account [name=" + name + ", address=" + address + ", phoneNo=" + phoneNo + ", email=" + email
				+ ", accountNo=" + accountNo + ", routingNo=" + routingNo + "]";
	}




	public String getPassword() {
		return password;
	}




	




	public String getName() {
		return name;
	}




	



	public String getAddress() {
		return address;
	}




	



	public String getPhoneNo() {
		return phoneNo;
	}




	



	public String getEmail() {
		return email;
	}




	




	public long getAccountNo() {
		return accountNo;
	}




	public long getRoutingNo() {
		return routingNo;
	}




	public static int getNoOfAccounts() {
		return noOfAccounts;
	}




	public static String getBankname() {
		return bankName;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
