package oop;

public class PrimitivesVSObject {

	public static void main(String[] args) {


		int i = 34;
		
		int j = 200;
		
		i = j;
		
		System.out.println(i);
		
		String str = new String("Java");
		
		String str2 = new String("Python");
		
		
		str = str2; // assigns str2's reference (pointer) to str
		            // str will be pointing to whatever str2 is pointing to
		
		
		String str3;
		//String str3 = null;
		
		str3 = str;
		
		
		
		
		
		System.out.println(str);
		
		System.out.println(str3);
		
		System.out.println(str2);
		
		
		str2 = null;
		
		System.out.println(str2.substring(2));
		
		
		
		
		

	}

}
