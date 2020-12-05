package character;

public class CharDemo {

	public static void main(String[] args) {


		char character = 'D';
		
		System.out.println('D');
		
		System.out.println("D");
		System.out.println('4');
		
		//System.out.println((int)Character.MAX_VALUE);
		
		System.out.println("The greek character alpha: \u03b1");
		
		System.out.println("The Cyrillic Capital Letter Shcha \u0429");
		
		
		char a = 'a';
		
		char numA = 97;
		
		char unicodeA = '\u0061';
		
		System.out.println((int)a);
		System.out.println(numA);
		System.out.println(unicodeA);
		
	//	System.out.println(++unicodeA);
		System.out.println(unicodeA + unicodeA); // char is being promoted to int
		
		
		System.out.println("\"He said \"\"You are awesome\"\" to the students\"");
		
		System.out.println("Character 'a''s numeric value is 97");
		
		System.out.println("/users/User/Desktop");
		
		System.out.println("C:\\Users\\Duotech\\Documents\\ANT");
		
		System.out.print("This is the first line\n");
		System.out.print("This is the second line\n");
		
		System.out.println("Here's the breakdown:\ndollars: 1\nquarters: 2\n\n");
		System.out.println("Last line");
		
		
		System.out.println("This\tline\tis\tperfectly\taligned");
		System.out.println("This\tline\tis\tperfectly\taligned");
		
		
		System.out.println((char)98.45);
		
		System.out.println((byte)'b');
		
		
		byte b = 'a';
		
		byte c = (byte)'\u0429';
		
		System.out.println(c);
		
		System.out.println('4' + '5');// 52 + 53
		
		System.out.println(3 + 4 + "5"); // 7 + "5"
		
		System.out.println("5" + 3 + 4); // "5" + 
		
		System.out.println(5 + "3" + 4);
		
		System.out.println(4 + '4' + "4");
		
		
		System.out.println("" + 5 + 6 + 8);
		
		System.out.println("My" + true);
		System.out.println('4' + '5' + "5");
		
		
		System.out.println("5" + (3 + 4));

	}

}
