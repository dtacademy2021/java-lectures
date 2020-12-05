package staticVSdynamicBinding;

public class Employee {
	
	
	public void work() {
		System.out.println("Working");
	}
	
	
public static void main(String[] args) {
		
		//Static binding vs Dynamic binding
		//Early binding vs Late binding
		//Compile-time polymorphism vs runtime polymorphism
		//Method overriding vs method overloading
		
		
		
		
		Employee employee1 = new Employee();
		
		employee1.work();
		
		
		Employee employee2 = new QAEngineer();
		
		employee2.work();
		
		
		Employee employee3 = new AutomationEngineer();
		
		employee3.work();
		
		
		
		Employee employee4 = new SeleniumEngineer();
		
		employee4.work();
		
	}

}
