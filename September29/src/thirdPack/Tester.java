


package thirdPack;







import java.util.Scanner;

import anotherPack.subpack.susubpack.ZooTiger;
//import pack.ZooTiger; //The import pack.ZooTiger collides with another import statement

import static java.util.Arrays.sort;



import static java.util.Arrays.binarySearch;



import static pack.ZooTiger.zooName;

import static pack.ZooTiger.getZooName;





//import java.lang.String; // explicit import of String class
// import java.lang.*; // this is implicitly inserted for all classes
public class Tester {

	public static void main(String[] args) {

		// We need to import classes that are located in a different package
		// java.lang package is imported automatically to every java class
		// regular import statements import classes
		// packages help avoid name conflicts and help access the correct class by using packageName.className
		
		String str = "Java";
		
		Scanner sc = new Scanner(System.in); // Scanner class is located in a different than java.lang hence we need to import it
		
		ZooTiger tiger = new ZooTiger();
		
		//static imports will help us import static members of the class (static variables and static methods)
		
		int [] arr = {34,2,1};
		
		sort(arr);
		
	
		
		System.out.println(binarySearch(arr, 2));
		
		System.out.println(pack.ZooTiger.zooName);
		
		getZooName();
		

	}

}
