package arraylist;

import java.util.*;


public class Arraylistdemo {

	public static void main(String[] args) {
		
		
		List<String> lst = new ArrayList<>();
		
		lst.add("Nihal");
		lst.add("Nastya");
		
		System.out.println(lst);
		
		lst.add(1, "Furkan");
		
		System.out.println(lst);
		
		
		lst.add(3, "Fuad");
		lst.add(null);
		
		System.out.println(lst);
		
//		list.clear();
		
		System.out.println( lst.contains("Fuad"));
		
		
		System.out.println( lst.contains(null));
		
		System.out.println(lst.get(1));
		
		System.out.println(lst.size());
		
		for (int i = 0; i < lst.size(); i++) {
			String str = lst.get(i);
			
			if(str!=null) { // Checks for element being null, to prevent NullPointerException
				System.out.println(str.toUpperCase());
			}
			


		}
		
		System.out.println("120 lines of code....");
		
		
		System.out.println(lst);
		
		lst.set(3, "Fuad");
		
		lst.add("Fuad");
		
		System.out.println(lst);
		
		System.out.println(lst.indexOf("Fuad"));

		System.out.println(lst.indexOf(null));
		
		System.out.println(lst.lastIndexOf("Fuad"));
		
		
		System.out.println(lst);

		
		System.out.println(lst.remove(null));
		
		System.out.println(lst);
		
	//	System.out.println(new StringBuilder("abcd").delete(0, 1).append("e"));
		
		
		
		
		System.out.println(lst);
		
		
		lst.remove(2);
		
		
		System.out.println(lst);
		
		
		
		

		List<Integer> list2 = new ArrayList<>();
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		
		System.out.println(list2);
		
		
		//list2.remove(100);
		
		System.out.println(list2);

		
		System.out.println(lst);
		
		
		lst.set(0, "NIHAL");
		
		System.out.println(lst);
		
		
		for (int i = 0; i < lst.size(); i++) {
			
			lst.set(i, lst.get(i).toUpperCase());
			
			
		}

		
		System.out.println(lst);
		
		System.out.println(lst.isEmpty());
		
		
		//Arraylist has an no-arg constructor that constructs an empty list with an initial capacity of 10.
		
		// List<Integer> list3 = new ArrayList<>(100); // creates an arraylist with initial capacity of 100
		
		
		
		List<String> list3 = new ArrayList<>(lst); // creates an arraylist from another collection
		
		
		String [] strArr = {"Nastya", "Konul", "Isa"};
		
		List<String> arrList = new ArrayList<>();
		
		
		for (String str : strArr) {
			arrList.add(str);
		}
 		
		
		System.out.println(arrList);
		
		//to convert an array to an ArrayList
		
		ArrayList<String> arrList2 = new ArrayList<>(Arrays.asList(strArr));
		
		
		
		System.out.println(arrList2);
		
		arrList2.add("xsahv");
		
	
		
		String [] arr2 = new String[arrList2.size()];
		
		arrList2.toArray(arr2);
		
		System.out.println(Arrays.toString(arr2));
		
		
		// Shortcut way of creating an ArrayList by passing all the elements at once
		
	//	String [] strArr = {"Nastya", "Konul", "Isa"};
		
		List<String> newList = Arrays.asList("Nastya", "Konul", "Isa");
		
		// Collections is a special class provided in java.util package to work with java collections such as Lists, Sets. Maps
		
		Collections.sort(newList);
		
		System.out.println(newList);
		
		System.out.println(Collections.binarySearch(newList, "Xerox"));
		
		System.out.println(Collections.min(newList));
		System.out.println(Collections.max(newList));

//		List<Mouse> scans = new ArrayList<>();
		
//		Collections.sort(scans);
//		Collections.binarySearch(scans, new Mouse());
//		Collections.min(scans);
		
//		Collections.shuffle(newList);
		
		System.out.println(newList);
		
		
		
		Collections.reverse(newList);
		
		System.out.println(newList);
		
		
		
		//Create an ArrayList of StringBuilders
//		
		ArrayList <StringBuilder> lst1 = new ArrayList<>();
//		
//		// Add 5 StringBuilder objects with some values -> add method, asList
//		
//		
		
//	List <StringBuilder> lst1 = Arrays.asList(new StringBuilder("Nastya"),
//											  new StringBuilder("Burcu"),
//											  new StringBuilder("Elena"),
//											  new StringBuilder("Furkan"),
//											  new StringBuilder("Fuad"));
//		
		// Add 5 StringBuilder objects with some values -> add method, asList
		
		lst1.add(new StringBuilder("Nastya"));
		lst1.add(new StringBuilder("Burcu"));
		lst1.add(new StringBuilder("Elena"));
		lst1.add(new StringBuilder("Furkan"));
		lst1.add(new StringBuilder("Fuad"));
		
		
		
		//Use for loop to print out StringBuilder values
		
		
		for (int i = 0; i < lst1.size(); i++) {
			System.out.println(lst1.get(i));
		}
		
//		for (StringBuilder stb : lst1) {
//			System.out.println(stb);
//		}
		
		//Change all StringBuilder objects by deleting their first character
		
		for (int i = 0; i < lst1.size(); i++) {

			lst1.get(i).deleteCharAt(0);
			
		}
		
		
		
		
		
		//Use for loop to print out StringBuilder values
		for (int i = 0; i < lst1.size(); i++) {
			System.out.println(lst1.get(i));
		}
		
		// Change all StringBuilder objects value in an ArrayList to "mouse"
		
		for (int i = 0; i < lst1.size(); i++) {

		//	lst1.get(i).replace(0, lst1.get(i).length(), "mouse");
			
			lst1.set(i, new StringBuilder("mouse"));
			
		}
		
		
		//Use for loop to print out StringBuilder values
		for (int i = 0; i < lst1.size(); i++) {
			System.out.println(lst1.get(i));
		}
		

	}

}
