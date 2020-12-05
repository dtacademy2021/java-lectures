package pack;

import java.util.Random;

public class ZooTiger {
	
	public int age;
	
	public static String zooName  = "San Diego Zoo";
	
	public ZooTiger() {
//		this.age = 5;
//		zooName = "San Diego Zoo";
	}
	
	
	public void roar() {
		System.out.println("Roaring");
	}
	
	public int getAge() {
		System.out.println(age);
		System.out.println(zooName);	// instance methods can access instance and static variables directly
		roar();
		getZooName();
		
		return this.age;
	}
	
	
	public static String getZooName() {
		//System.out.println(age);      //cannot access instance variable inside a static method
		System.out.println(zooName);
		//roar();  //cannot call instance method inside a static method
		isMammal();
		
		return zooName;
	}
	
	public static boolean isMammal() {
		return true;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		ZooTiger myTiger = new ZooTiger();

		System.out.println("The tiger's age is " + myTiger.age);
		
		myTiger.age = 34;
		
		System.out.println("The tiger's age is " + myTiger.age);
		
		
		new ZooTiger().age = 78;
//		
		System.out.println("The tiger's age is " + new ZooTiger().age);
		
		
		System.out.println(Math.PI);
		
		
		ZooTiger tiger2 = null;
		
		tiger2.getZooName(); // calling static method on a null object is Okay since static method does not require an object
		
		tiger2.roar(); // calling instance method on a null object results in NullPointerException
		
		
		
		
		
		
		

		
		
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
