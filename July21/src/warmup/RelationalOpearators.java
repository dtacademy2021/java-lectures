package warmup;

public class RelationalOpearators {

	public static void main(String[] args) {
		
		
		int a = 78;
		
		int b = 60;
		
		
		boolean b1 = a < b;
		
		System.out.println(b1);
		
		boolean b2 = a <= 78;
		
		System.out.println(b2);
		
		System.out.println(a > b);
		
		System.out.println(a == b);
		
		System.out.println( 45 == 45 );
		
		System.out.println( a != b );
		
		String str = "Java" ;
		String str2 = "Java";
		
		String str3 = new String("Java");
		
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		
		
		System.out.println(str == str2); // == checks if two objects' memory location is the same
		System.out.println(str == str3); //--> bad practice // == operator shoukd never be used to compare Strings, instead
										  // we should use equals() method of String
		
		System.out.println(str.equals(str3));
		
		
		int x = 7;
		int y = 9;
		
		
		boolean z = x == y ;
		
		System.out.println(z);
		
		boolean t = true;
		boolean d = false;
		
		System.out.println(t = d = z); // assignment -> from right to left

		System.out.println(t == d == d == z);// comparison opeartor -> from left to right

		
	}

}
