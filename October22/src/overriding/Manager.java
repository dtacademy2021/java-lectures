package overriding;

public class Manager extends Employee {
	
	public void work() {
		super.work();
		System.out.println("Organizing a meeting");
	}
	
	
	
	
	
	
//	public void displayHowTowork() {
//		super.work();
//		this.work();
//			
//	}
	
	
	public static void main(String[] args) {
		new Manager().work();
	}

}
