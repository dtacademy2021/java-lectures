package oop;

public class GarbageCollectionDemo {

	public static void main(String[] args) {
		
		
		String str1 = new String("Java");
		String str2 = new String("C#");
		String str3 = new String("Golang");
		
		String str4;
		
		
		str1 = str2;
		
		str2 = str3;
		
		str4 = str3;
		
		str3 = null;
		
		str4 = str3;
		
		str2 = str4;
		
		
		String str5 = "java";
		String str6 = new String("java");
		
		System.gc(); //suggestion for JVM to initialize gc process, not guaranteed to run
		
		
		
		
		
		
		
		
		
		
		

	}
	
	
	
	
	
}
