package objectClass;

import java.util.Arrays;
import java.util.List;

public class Mouse extends Animal{
	
	
	int age;
	
	String breed;
	
	
	
	
	public Mouse(int age, String breed) {
		super();
		this.age = age;
		this.breed = breed;
	}


	//Default implementation of a toString() method is className+@+hashcode
	
//	
	public String toString() {
		return "Mouse class";
	}
	
	
//	public boolean equals(Object m) {
//
//        return this.age==((Mouse)m).age &&
//        		this.breed==((Mouse)m).breed;
//        		
//        
//		
//	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		 Object o = new Object();
		 
		 
		 Mouse m = new Mouse(2, "field");
		 Mouse m2 = new Mouse(2, "field");
		 
		 
		 System.out.println(m); // --> System.out.println(m.toString());
		 
		 
		 int[] arr = {1,2,3};
		 
		 
		 System.out.println(arr);
		 
		 
		 
		 List<Integer> list =  Arrays.asList(1,2,3);
		 
		 System.out.println(list);
		 
		 
		 System.out.println(m.equals(m2)); 
		
		 // default implementation of equals() method is --> m==m2
		// System.out.println(m==m2);
		 
		 
		 String s = new String("java");
		 String s1 = new String("java");
		 
		 System.out.println(s.equals(s1));
		 
		 
		 StringBuilder sb = new StringBuilder("java");
		 StringBuilder sb1 = new StringBuilder("java");
		 
		 System.out.println(sb.equals(sb1));
		 System.out.println(s.equals(sb));
		 
		 
		 System.out.println(m.getClass());
		 
		 System.out.println(s.getClass());
		 System.out.println(sb.getClass());
		 
		 
		 //Returns the runtime class of this object
		 
		 Animal a = new Animal();
		 Animal a1 = new Mouse(2, "chdsvga");
		 
		 System.out.println(a.getClass());
		
		 System.out.println(a1.getClass());
		 
		 
		 
//		 int[] arr1 = {1,2,3};
		 
		 
//		 System.out.println(arr1);
		 
//		 System.out.println(Arrays.toString(arr1));
		 
		 
		 
		
	}




	

}
