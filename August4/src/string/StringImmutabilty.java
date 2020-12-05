package string;

public class StringImmutabilty {

	public static void main(String[] args) {
		
		//String is immutable -> Once you create a String with initial value, you cannot change it
		// unless you assign a new value;
		
		
		String str = "         Hello World  ";
		
		str.replace("H", "B");
		
		System.out.println(str);
		

	}

}
