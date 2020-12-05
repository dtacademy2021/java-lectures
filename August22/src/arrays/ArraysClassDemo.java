package arrays;

import java.util.Arrays;

public class ArraysClassDemo {

	public static void main(String[] args) {
		
		
		
		int [] nums = {3,4,12,45,23,11,22,34,67,900,1,-2, 67};
		
		System.out.println(Arrays.toString(nums));
		
		//Arrays -> Utility class that contains various static methods for manipulating arrays (such as  sorting and searching).

		
		//Sorts the specified array into ascending numerical order.
//		
		
		Arrays.sort(nums);
	
		
		Arrays.parallelSort(nums);
		
		System.out.println(Arrays.toString(nums));
		
		
		String [] names = { "10", "11", "12", "01", "101"};
		
		int [] num = { 10, 11, 12, 014, 101};
		
		//alphabetical order vs lexicographical order(ascii table order)
		
		Arrays.sort(names);
		
		Arrays.sort(num);
		
		System.out.println(Arrays.toString(names));
		
		System.out.println(Arrays.toString(num));
		
		

		
		int [] num1 = { 23, 22, 11, 014, 101};
		
		Arrays.sort(num1);
		
		System.out.println(Arrays.toString(num1));
		
		int index = Arrays.binarySearch(num1, 1000);
		
		System.out.println(index);
		
		
		
		double [] arr1 = {1,   4,   5};
		double [] arr2 = {1.0, 4.0, 5.0};
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		//Example of error in comparing decimal numbers in Java
		double n = 1.0 - 0.1 - 0.1 - 0.5;
		System.out.println(n);
		System.out.println(n==0.3);
		
		
		System.out.println(arr1==arr2);
		
		System.out.println(Arrays.equals(arr1, arr2));
		
		
		double [] arr3 = {1,4,5,6,12,33,0};
		
//		Arrays.fill(arr3, 99);
		
//		System.out.println(Arrays.toString(arr3));
		
		Arrays.fill(arr3, 5, 5, 99);
		
		System.out.println(Arrays.toString(arr3));
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		
		System.out.println(Arrays.binarySearch(arr1, 2) == Arrays.binarySearch(arr1, 2));
		
		System.out.println(Arrays.equals(arr1, arr2));
		
		
		
	
		
		
		
		
		
		
		

	}

}
