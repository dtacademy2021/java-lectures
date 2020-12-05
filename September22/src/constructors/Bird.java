package constructors;

public class Bird {
	
	 Bird() {} // final, static and abstract cannot be used with constructors

//	public  Bird (String name) {
//		System.out.println("one arg");
//	}
////	
//	public  Bird (String name , String name2) {
//	    System.out.println("two args");
//}
//	
//	public  Bird () {
//		System.out.println("no args");
//	}

   public Bird(String ... names) {
	   System.out.println("varargs");
   }
	
	//default constructor -> a constructor that is inserted by Java that has no arguments and
	// empty body. It will be inserted if and only if there is no constructor inserted by the programmer
	// The default constructor is inserted implicitly 
	
	
	
	
	public static void main(String[] args) {
    		 Bird b = new Bird();
    		 Bird b1 = new Bird("bcdshds");
    		 Bird b2 = new Bird("svavs", "svgacfg");
    		 Bird b3 = new Bird("svavs", "svgacfg", "cshvmavacsg");
	}

}
