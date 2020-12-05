package sb;

public class StringBuilderDemo {

	public static void main(String[] args) {


		String st = new String ("Konul");
		
		
		st.concat(" S").concat(" is also").concat(" rich");
		
		
		System.out.println("String: " + st);
		
		
		// StringBuilder class was introduced in Java 1.5
		
		//StringBuilder sb = new StringBuilder(); // empty 
		
		StringBuilder sb = new StringBuilder("Konul");
		
		System.out.println("StringBuilder: " + sb);
		
		sb.append(" S");
		
		System.out.println("StringBuilder after method call: " + sb);
		
		
		
		StringBuffer sbf = new StringBuffer("Furkan");
		
		sbf.append(" Ozturk");
		
		System.out.println("StringBuffer after method call: " + sbf);
		
		
		
		StringBuilder sb1 = new StringBuilder("Fatih");
		
		sb1.append(" is").append(" rich").append(" at home ").append(true).append(3527653276L);
		
		
		
		System.out.println(sb1);
		
		sb1.delete(6, 8);
		
		System.out.println(sb1);
		
		sb1.delete(1, 1);
		
		System.out.println(sb1);
		
	//	sb1.delete(1, 0); // will throw java.lang.StringIndexOutOfBoundsException
		
		System.out.println(sb1.length());
		
		//sb1.delete(33, 34);
		
	//	sb1.delete(34, 34);
		
		
		
		sb1.deleteCharAt(sb1.length()-1);
		
		System.out.println(sb1);
		
		sb1.insert(11, " and happy"); // inserts value at given index
		
		System.out.println(sb1);
		
		sb1.append("BekBekBek", 0, 3); // appends indicated substring of the given String 
		
				
		System.out.println(sb1);
		
		sb1.replace(sb1.indexOf("true"), sb1.indexOf("true")+4, "false");
		
		System.out.println(sb1);
		
		
		StringBuilder sb2 = new StringBuilder("Java is awesome");
		
		sb2.reverse();
		
		System.out.println(sb2);
		
		System.out.println(reverseString("Java"));
		
		String s = "ha";
		
		for (int i = 0; i < 1000; i++) {
			s = s.concat("ra");
		}
		
		System.out.println("String: " + s);
		
		StringBuilder s1 = new StringBuilder("ha");
		
		for (int i = 0; i < 1000; i++) {
			s1.append("ra");
		}
		
		System.out.println("StringBuilder: " +s1);
		
		
		
		
		StringBuilder empty = new StringBuilder(); //Creates an empty Stringbuilder obj with default capacity = 16
		
		System.out.println("Capacity: " + empty.capacity());
		System.out.println("Length: " + empty.length());
		
		empty.append("A");
		
		System.out.println("Capacity: " + empty.capacity());
		System.out.println("Length: " + empty.length());
		
		empty.append("123456789101213");
		
		System.out.println("Capacity: " + empty.capacity());
		System.out.println("Length: " + empty.length());
		
		empty.append("1");
		
		System.out.println("Capacity: " + empty.capacity());
		System.out.println("Length: " + empty.length());
		
		
		
		StringBuilder cap = new StringBuilder(100);
		
		cap.append("12332767843333333647326666667444444444444444444444444444444444444444444444444444444444444444444444442");
		
		System.out.println("Capacity: " + cap.capacity());
		System.out.println("Length: " + cap.length());
		
		
	}
	
	
	 
	
	public  static  String reverseString(String str) {
		
		return new StringBuilder(str).reverse().toString();
	 }
	 //synchronized keyword can be used with methods and blocks

}
