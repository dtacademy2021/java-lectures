package abstarction2;

public abstract  class Bill {
	
	//When you add an abstract method to a concrete class, that class now must be declared an abstract
	// abstract classes can also have methods with implementation
	
	
	
	
	public abstract String getCustomerDetails();
	
	public void calculateUsage() {
		System.out.println("Calculating usage");
	}

}
