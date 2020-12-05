package immutability;

public class ImmutableDemo {

	public static void main(String[] args) {

		String str = new String ("Furkan");
		
		
		String newStr = str.concat(" Ozturk");
		
		System.out.println(newStr);
		
		System.out.println(str);
		
		
		
		
		MyString str2 = new MyString ("Furkan");
				
		str2.concat(" Ozturk");
		
		System.out.println(str2);
		
		
		

	}

}
