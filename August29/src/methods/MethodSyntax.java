package methods;

public class MethodSyntax {
	
	
	
	
	public static void main(String[] args) {
		
		
//		MethodSyntax.myOwnMethod2(23, 33); // -> 6 is the argument 
//		
//		myOwnMethod2(1, 67); //Classname can be omitted if the method is declared in the same class
		
		
		printReversedString("Java is awesome");
		
		
		printReversedString("Fuad");
		
		
		printReversedString("Konul");
		
		
		
		
				
	}
	
	public static void printReversedString(String str) {
		
		for (int i = str.length()-1; i >=0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
	}
	
	
	
	// method names start with lowercase and then CamelCase
	//Methods need to be defined on class level
	
	public static void myOwnMethod1 () {
		
		
		
	}
	
	public static void myOwnMethod2 (int number, int anotherNumber) {
		
		System.out.println("The number " + number + " is passed to this method");
		System.out.println("another number " + anotherNumber + " is passed to this method");
		
	}
	
	//public, static -> modifiers are optional
	//void -> return type is mandatory
	
	//(), (int number) -> parameters, think of them as placeholders
	
	//Methods can have parameters or no parameters at all
	
	//The method name and the parameter list together constitute the method signature
	//myOwnMethod2 (int number, int anotherNumber)
	

}
