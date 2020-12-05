package bankAcct;

public class NullPointerExceptionDemo {

	
	
	public static void main(String[] args) {

		BankAccount b = new BankAccount();
		
		b = null; // explicit assignment of null
		
		System.out.println(b.getInfo());
		



	}

}
