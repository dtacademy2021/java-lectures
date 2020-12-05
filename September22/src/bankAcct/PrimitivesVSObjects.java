package bankAcct;

public class PrimitivesVSObjects {

	public static void main(String[] args) {
		
		
		//Reference types
		// Class, Enum, Interface, Array, Annotation
		
		int num = 9; 
		
		// num stores the value of 9 in itself in stack
		
		
		
		//anonymous objects
		System.out.println(new BankAccount().balance); //When we need an object only once
		System.out.println(new BankAccount("schacs").balance);
		
		
		
		printBankAcc(new BankAccount()); // 
		
		// acc is a reference variable which is stored in stack and refers (points) to the actual object in the heap
        // new BankAccount() -> creates the actual object in the heap.

		

	}
	
	public static void printBankAcc (BankAccount b) {
		
	}

}
