package staticKeyword;

import java.util.Random;

public class Employee {
	
	//instance variables
	
	String name;
	long id;
	double salary;
	String dept;
	boolean isFullTime;
	
	final static String companyName = "Verizon";
	
	static int countOfEmployeeObjects = 0 ;
	
	
	
	
	
	public Employee(String name,  double salary, String dept, boolean isFullTime) {
		
		this.name = name;
		this.id = generateRandomId();
		this.salary = salary;
		this.dept = dept;
		this.isFullTime = isFullTime;
		
		countOfEmployeeObjects++;
	}
	
	
	
	
	public void getPaid() {
		
	}
	
	
	public static void calculateBonus(double sales) {
		
	}
	
	
	public static int getCountOfObjects() {
		
		return countOfEmployeeObjects;
		
	}
	
	
	public static int generateRandomId () {
		return new Random().nextInt(1000);
	}
	
	




}
