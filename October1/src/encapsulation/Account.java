package encapsulation;

import java.util.Scanner;

public class Account {
	// Java Bean -> a regular Java class that follows encapsulation principle with naming conventions
	// POJO -> Plain Old Java Object
	
	// OOP Principles: encapsulation, inheritance, polymorphism, abstraction
	
	//Encapsulation(Data Hiding) principle of OOP: Make your data (variables) private and provide public getters
	// and setters for your fields
	
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




	public void setOnlineAcct(boolean onlineAcct) {
		this.onlineAcct = onlineAcct;
	}




	public Account(String name, String address, String phoneNo, String email, long accountNo, long routingNo) {
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




	public void setPassword(String password) {
		this.password = password;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public String getPhoneNo() {
		return phoneNo;
	}




	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
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
