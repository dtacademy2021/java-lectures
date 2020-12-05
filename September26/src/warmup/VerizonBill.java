package warmup;

public class VerizonBill {
	
	
	/*
	 * Design a class that simulates a Bill (Internet, Cable)

			Instance variables:
			
				String customerName;
				String address;
				long accountNo;
				double amountUsedInGB;
				double pricePerGB;
				double amountDue;
			
			
			
			Constructors: (Use this to refer to instance variables, also this() to refer to other constructors)
			
				- no-arg -> initialize all fields with some random values (call the constructor that initializes all fields)
				- that initializes customerName, address, accountNo
				- that initializes all fields (call the constructor that initializes 3 fields)
			
			Instance methods:
			
			    - printInfo() - prints all the infor about the properties of the object
			    - calculateAmountDue() - calculates the amountDue and returns it to the caller
			    - getAmountUsed() - gets the amountUsedinGB
			    - setPricePerGB(double pricePerGB) - sets the new price for each GB of Data
			    - setAmountDue(double amountDue) - sets the new amountDue
			
			
			 Create a Tester class and create 3 objects with 3 diffrent constructors
			
			 Call the methods and verify implementation
	 */
	
				String customerName;
				String address;
				long accountNo;
				double amountUsedInGB;
				double pricePerGB;
				double amountDue;
				
				
				public VerizonBill() {
					
					this("John", "145 blue rd", 2156413256L, 23, 0.2, 34);


				}
				
				
				public VerizonBill(String customerName, String address,
						long accountNo ) {
					
					this.customerName = customerName;
					this.address = address;
					this.accountNo = accountNo;
					
				}
				
				
				public VerizonBill(String customerName, String address,
						 long accountNo, double amountUsedInGb, double pricePerGb, double amontDue) {
						
					this(customerName, address , accountNo);
					
						this.amountUsedInGB = amountUsedInGb;
						this.pricePerGB = pricePerGb;
						this.amountDue = amontDue;
						
					}
				
				
				public  void printInfo() {
					
					System.out.println("Customer name: " + customerName + "\n" + 
					
									"Address : " + address + "\n" +
									
									"Account number : " + accountNo + "\n" +
									
									"Used amount : " + amountUsedInGB + "\n" +
									
									"Price per GB : " + pricePerGB + "\n" +
									
									"Amount due : " + amountDue);
					
					
				}


				
				public String toString() {
					return "VerizonBill [customerName=" + customerName + ", address=" + address + ", accountNo="
							+ accountNo + ", amountUsedInGB=" + amountUsedInGB + ", pricePerGB=" + pricePerGB
							+ ", amountDue=" + amountDue + "]";
				}
				
				
				
				public double calculateAmountDue() {
					return amountDue = amountDue + (amountUsedInGB*pricePerGB);
				}
				
				
				
				public double getAmountUsed() {
					return this.amountUsedInGB;
				}
				
				
				public void setPricePerGB(double pricePerGB) {
					 this.pricePerGB = pricePerGB;
				} 
			    
				public void setAmountDue(double amountDue) {
					 this.amountDue = amountDue;
					
				}
				
				public static void main(String[] args) {


					VerizonBill bill = new VerizonBill("Nastya", "123 main st", 1234567891234L, 55, 10, 15);
					
					//bill.printInfo();
					
					
					double dueToday = bill.calculateAmountDue();
					
					
					System.out.println(dueToday);
					
					
					VerizonBill bill2 = new VerizonBill();
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					

				}
				
				
				
				
				


				
				
				
				
				
				
				

}
