package warmup;

public class Tester {

	public static void main(String[] args) {


		VerizonBill bill = new VerizonBill("Nastya", "123 main st", 1234567891234L, 55, 10, 15);
		
		//bill.printInfo();
		
		
		double dueToday = bill.calculateAmountDue();
		
		
		System.out.println(dueToday);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
