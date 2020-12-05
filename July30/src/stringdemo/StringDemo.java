package stringdemo;

public class StringDemo {

	public static void main(String[] args) {
		// In Java we can create Strings in 2 ways:
		
		String st = "Anything is Possible"; //Creating a string obkject using String pool 
		
//		String st1 = new String("Anything"); //Creating a string object using new keyword
		
		//charAt(index) //Returns the char value at the specified index
		
		char ch = st.charAt(8); // . operator calls or invokes a method on an object
		
		
		//Java has 2 kinds of methods: methods that return value
		//								methods that do not return value
		
		//Methods can have some number of arguments or can have  no arguments at all
		
		System.out.println(ch);
		
//		System.out.println(st.charAt(8));
		
//		System.out.println(st.charAt(8)); // No compiler error, but will throw Runtime error
		
		
		 
		
		System.out.println(st.length());
		
		// In Java length() method gives the actual count of the characters in A String, length starts from 1
		// But indexes start from 0.
		
		String empty = ""; //Empty string is legal in Java
		
	//	System.out.println(empty.charAt(0)); // Will throw Exception
		
		System.out.println(empty.length()); //
		
		
		String anotherOne = "July Twenty";
		
		System.out.println(anotherOne.length()-1); // length() -1 gives the last index, since index is always one less than the length
		
		int lastIndex = anotherOne.length()-1;
		
		System.out.println(anotherOne.charAt(lastIndex));
		
//	alternative of the above //	System.out.println(anotherOne.charAt(anotherOne.length()-1));
		
		
		String s1 = "Donald";
		String s2 = " Trump";
		
		System.out.println(s1 + s2);
		
		System.out.println(s1.concat(s2));
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println("JAVA".toLowerCase()); //String methods can be invoked on String literals too
		
		String strWithSpaces = " \t  \f   Tysons Corner\n   \r "; 
		//elimites whitespace characters fro both ends
		//whitespace - ' ', \t, \n, \f, \r
		
		System.out.println(strWithSpaces.trim());
		
		
		
		String st1 = "Java is easy";
		String st2 = "Java is Easy";
		
	//	System.out.println(st1 == st2); // never use == to compare strings because it is unreliable
		
		
		System.out.println(st1.equals(st2));
		System.out.println(st1.equalsIgnoreCase(st2));
		
		
		
		String st3 = "A";
		String st4 = "a";
		
		System.out.println(st3.compareTo(st4));
		System.out.println(st3.compareToIgnoreCase(st4));
		
		
		
		
		
		String st5 = "Duotech";
		String st6 = "tech";
		
		System.out.println(st5.startsWith("duo"));
		System.out.println(st6.startsWith("Tech".toLowerCase()));
		System.out.println(st5.endsWith("tech"));
		System.out.println(st6.startsWith("tech"));
		System.out.println(st6.endsWith("tech"));
		
		
		String title = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		
		System.out.println(title.contains("Online Shopping"));
		
		
		
		String price  = "$19.99";
		
		//substring(beginningIndex) -> starts from the indicated index till the end of the string
		//substring (beginningIndex, endingIndex) -> starts from indicated beginning index,
		// and ends right before indicated ending index (character at end index is not included)
		
		String sub = price.substring(1);
		System.out.println(sub);
		
		String sentence = "Online people, Can you give me a sentence?";
		
		System.out.println(sentence.substring(7, 13));
		
		System.out.println(sentence.substring(33));
		
		System.out.println(sentence.substring(sentence.length()-9 , sentence.length()-1 ) );
		
		
		
		String word  = "Java";
		
		//Edge cases with substring method
		
		System.out.println(word.substring(2,3)); // returns v
		System.out.println(word.substring(2,2)); // returns empty string
	//	System.out.println(word.substring(2,1)); // results in StringIndexOutOfBoundsException
	//	System.out.println(word.substring(2, -2)); //results in StringIndexOutOfBoundsException
	//	System.out.println(word.substring(2, 8)); //results in StringIndexOutOfBoundsException
		System.out.println(word.substring(2, 4)); // results in va
		System.out.println(word.substring(4, 4)); // results in empty string
		
		
		String anotherWord = "Virginia lovers is for lovers";
		//indexOf(character)
		System.out.println(anotherWord.indexOf('V')); 
		System.out.println(anotherWord.indexOf('l')); 
		System.out.println(anotherWord.indexOf('x')); // returns -1
		System.out.println(anotherWord.indexOf('z')); // returns -1
		//indexOf(character, startingFrom)
		System.out.println(anotherWord.indexOf('i', 0)); //returns 1
		System.out.println(anotherWord.indexOf('i', 2)); //returns 4
		
		//indexOf(String)
		System.out.println(anotherWord.indexOf("lovers")); //returns 9
		//indexOf(String, startingFrom)
		System.out.println(anotherWord.indexOf("lovers", 10)); // returns 23
		
		//lastIndexOf(String)
		System.out.println(anotherWord.lastIndexOf("lovers")); // returns 23
		//ğ
		//ş
		String greeting = "Tanistigima memnun oldum";
		
		System.out.println(greeting.replace('s', 'ş').replace("g", "ğ").replaceAll("i", "ı").toUpperCase());  //method chaining

		
		System.out.println("   It is an intersting class tonight  ".toUpperCase().trim().substring(9));
		
		
		
	}

}
