package warmup;

public class Person {
	static String name;
	int age = 25;
	
	

	Person(String name) { // line n1
		this.name = name;
	}

	public Person(String name, int age) {
	 // line n2
		
		this.age = age;
		
	}

	private void Person(String name2) {
		// TODO Auto-generated method stub
		
	}

	public String show() {
		this.name = "John";
		return name + " " + age;
	}

	public static void main(String[] args) {
		
		Person p1 = new Person("Jesse");
		Person p2 = new Person("Walter ", 52);
		System.out.println(p1.show());
		System.out.println(p2.show());
	}
}
