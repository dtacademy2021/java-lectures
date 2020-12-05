package strings;

public class StringEquality {

	public static void main(String[] args) {


		String str = "Selenium";
		
		String str2 = "Selenium";
		
		System.out.println("Equals method: " + str.equals(str2));
		
		System.out.println(" == : " + (str == str2) );
		// equals() method checks whether 2 String objects have equal values
		
		
		String str3 = new String("RestAssured");
		String str4 = new String("RestAssured");
		
		System.out.println(str3.equals(str4));
		
		System.out.println(" == : " + (str3 == str4) );
		
		str3 = str4;
		
		System.out.println(" == : " + (str3 == str4) );
		
		str3 = null;
		str4 = null;
		
		System.out.println(" == : " + (str3 == str4) );
		
		//System.out.println(str3.equals(str4)); //NPException
		
		
		
		System.out.println("________________________________________________________________");
		
		String st1 = "Git";
		String st2 = new String("Git");
		StringBuilder sb = new StringBuilder("Git");
		StringBuilder sb2 = new StringBuilder("Git");
		
		System.out.println(st1==st2);
		System.out.println(st1.equals(st2));
		
		
	//	System.out.println(st1==sb); //  both sides of  == operator have to be of the same or compatible types
	//	System.out.println(4==true);
//		System.out.println(st2==sb);
		
		System.out.println(st1.equals(sb));
		System.out.println(st2.equals(sb));
		
		System.out.println(sb == sb2);
		System.out.println(sb.equals(sb2)); // StringBuilder class does not override equals
		
		Object o;
		
		
		Cup c = new Cup ("Starbucks");
		Cup c1 = new Cup ("Starbucks");
		
		System.out.println(c.equals(c1));
		
		System.out.println("________________________________________________________________");
		
		
		String st5 = "Java";
		String st6 = "Ja"+"va";
		String st7 = "Ja".concat("va");
		
		System.out.println(st5==st6);
		
		System.out.println(st5.equals(st6));
		
		System.out.println(st5==st7);
		
		System.out.println(st5.equals(st7));
		
		
		
		String str9 = "Akmal";
		
		System.out.println(str9.replace('A', 'A') == str9);
		System.out.println(str9.toLowerCase() == str9.toLowerCase());

	}

}
