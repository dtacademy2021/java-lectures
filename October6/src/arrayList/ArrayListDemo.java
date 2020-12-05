package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import strings.Cup;

public class ArrayListDemo {

	public static void main(String[] args) {


		//ArrayList class was introduced in Java 1.2 as a resizable version of an array 
		
		List list = new ArrayList();
		
		list.add("Java");
		list.add(34);
		list.add("c");
		
		for (String s : list) {
			System.out.println(s);
		}
		
		
		
		ArrayList <String> list2 = new ArrayList<String>();  // Java 1.5 added Generics support
		//String[] arr = new String[3];
		list2.add("Java");
		// list2.add(null); null can also be added to any arraylist object
		
		
		
		
	//	List <String> list4 = new ArrayList<>(); // List is a parent of Arraylist
	//   ArrayList <String> list5 = new List <>();	 // Compilation error
		
		
		ArrayList <String> list3 = new ArrayList <>(); // Starting Java 1.7 we can remove type in the object creation part

		
		System.out.println(list3);
		
		
		list3.add("Nastya");
		list3.add("Burcu");
		list3.add(null);
		list3.add("Furkan");
		list3.add(new String("Fatih"));
		System.out.println(list3);
		
		//Wrapper classes -> Class version of primitives
		// int -> Integer, double -> Double
		ArrayList <Integer> list4 = new ArrayList <>(); // ArrayList accepts only objects, no primitives
		
		list4.add(45);
		list4.add(34);
		System.out.println(list4);
		
		List <String> l = Arrays.asList("Nastya", "Burcu", "Nihal");
		
		
		
	
	
	}

}
