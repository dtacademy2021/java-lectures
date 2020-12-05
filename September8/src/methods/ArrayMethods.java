package methods;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {

//		int [] arr = new int [] {90, 23,1,-5,234,65};
//		
//		displaySortedArray(arr);

		displaySortedArray(new int[] { 90, 23, 1, -5, 234, 65 });

		int[] sortedOne = getSortedArray(new int[] { 90, 23, 1, -5, 234, 65 });

		System.out.println(Arrays.toString(sortedOne));

	}

	public static void displaySortedArray(int[] arr) {

		Arrays.sort(arr);

		System.out.print("The sorted array is: ");

		for (int num : arr) { // for-each loop / enhanced for loop

			System.out.print(num + " ");
		}

		// Syntax -> for (each element Type in a collection : Collection reference) {}

		System.out.println();

	}

	public static int[] getSortedArray(int[] arr) {

		Arrays.sort(arr);

		return arr;
	}

}
