package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTester {

	public static void main(String[] args) {


		List<Contact> list = new ArrayList<>();
		// to add a new contact to the arraylist:
		// We can create an object with ref variable
		// Or directly add as an anonymous obj
		
		
		Contact c1 = new Contact("Nihal", "2012349756", "nihal@gmail.com", "123 Main st");
		
		list.add(c1);
		
		Contact c2 = new Contact("Furkan", "201234934", "furkan@gmail.com", "123 Fair st");
		
		list.add(c2);
		
		System.out.println(list);
		
		
		list.add(new Contact("Dilmurod", "201231111", "dilmurod@gmail.com", "123 Main st"));
		
		System.out.println(list);
		
		
		System.out.println(list.contains(c2));
		
		Contact c3 = new Contact("Furkan", "201234934", "furkan@gmail.com", "123 Fair st");
		
		
		System.out.println(list.contains(new Contact("Furkan", "201234934", "furkan@gmail.com", "123 Fair st")));
		
		
		System.out.println(list);
		
		Contact c4 = c2;
		
		System.out.println(list.indexOf(c4));
		System.out.println(list.indexOf(c2));
		
		System.out.println(list);
		
		list.add(c2);
		
		System.out.println(list);
		

	}

}
