package constructors;

public class Tester {
	
	
	public static void main(String[] args) {

//		DuotechStudent student1 = new DuotechStudent();
//		
//		student1.name = "Konul";
//		student1.batchNo = 3;
//		student1.email = "konul@gmail.com";
//		
//		System.out.println(student1.name);
//		System.out.println(student1.batchNo);
//		System.out.println(student1.email);
//
//		DuotechStudent student2 = new DuotechStudent();
//		
//		student2.name = "Nihal";
//		student2.batchNo = 3;
//		student2.email = "nihal@gmail.com";
//		
//		System.out.println(student2.name);
//		System.out.println(student2.batchNo);
//		System.out.println(student2.email);  // Not recommended
		
		DuotechStudent st3 = new DuotechStudent();
//		
		DuotechStudent st4 = new DuotechStudent();
		
		System.out.println("Student st5 -----------------------------------");
		DuotechStudent st5 = new DuotechStudent();
		System.out.println(st5.name);
		System.out.println(st5.id);
		System.out.println(st5.email);
		System.out.println(st5.phone);
		System.out.println(st5.isOnline);
		System.out.println(st5.batchNo);
		
		st5.useSlack();
		
		System.out.println("Student st6 -----------------------------------");
		DuotechStudent st6 = new DuotechStudent("Burcu");
		System.out.println(st6.name);
		System.out.println(st6.id);
		System.out.println(st6.email);
		System.out.println(st6.phone);
		System.out.println(st6.isOnline);
		System.out.println(st6.batchNo);
		st6.useSlack();
		
		System.out.println("Student st7 -----------------------------------");
		DuotechStudent st7 = new DuotechStudent(1232156, false, "Konul", 3, "konul@gmail.com", "2021234567");
		
		System.out.println(st7.name);
		System.out.println(st7.id);
		System.out.println(st7.email);
		System.out.println(st7.phone);
		System.out.println(st7.isOnline);
		System.out.println(st7.batchNo);
		st7.useSlack();
		
		System.out.println("Student st8 -----------------------------------");
		DuotechStudent st8 = new DuotechStudent(21331, true, "Nastya", 3, "nastya@gmail.com", "213454312");
		
		System.out.println(st8.name);
		System.out.println(st8.id);
		System.out.println(st8.email);
		System.out.println(st8.phone);
		System.out.println(st8.isOnline);
		System.out.println(st8.batchNo);
 		st8.useSlack();
		
	}

}
