package staticKeyword;

public class Tester {
	
	public static void main(String[] args) {
		
		
		Employee emp1 = new Employee("Konul",  120000, "QA", true);
		
		Employee emp2 = new Employee("Nihal",  110000, "QA", false);
		
		Employee emp3 = new Employee("Nihal",  110000, "QA", false);
		
		
		System.out.println(emp1.name);
		
		emp1.name = "Rachel";
		
		System.out.println(emp1.companyName);
		
		//emp1.companyName = "AT&T";
		
		System.out.println(emp1.companyName);
		
		System.out.println(emp2.companyName);
		
		//emp2.companyName = "T-mobile";
		
		System.out.println(emp1.companyName);
		
		System.out.println(emp2.companyName);
		
		
		System.out.println();
	
		
		
		
	}

}
