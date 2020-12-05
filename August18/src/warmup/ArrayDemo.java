package warmup;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo {

	public static void main(String[] args) {
		
		
		
		
		
		//Array
		
		// Store 10 guesses in a collection and get the average of those guesses
		//Get the 10 guesses from the user
		
		int [] guesses; //declaring an array of integers with name
		
		guesses = new int [10]; // initialization with predeterminded size
		
//		int [] guesses = new int [10]; // Declare and initialize 
		
		
		guesses[0] = 120;
		guesses[1] = 150;
		guesses[2] = 180;
		guesses[3] = 200;
		guesses[4] = 500;
		guesses[5] = 20;
		guesses[6] = 30;
		guesses[7] = 40;
		guesses[8] = 90;
		guesses[9] = 144;
		
		System.out.println(guesses[5]);
		
		System.out.println(guesses[guesses.length-1]);
		
		System.out.println(guesses[1] + guesses[2]);
		
		//Print out the contents of the array
		
//		
//		for(int i = 0; i< guesses.length; i++) {
//			System.out.println(guesses[i]);
//		}
		
		//Find the average
		int sum = 0;
		for(int i = 0; i< guesses.length; i++) {
			sum += guesses[i];
		}
		System.out.println(sum);
		
		double average = (double)sum / guesses.length;
		
		System.out.println("The average of the numbers in the array: " + average);
		
		//Find out how many guesses are above are average
		
		int countAbove = 0;
		
		for(int i = 0; i< guesses.length; i++) {
			
			if(guesses[i]>average) {
				System.out.print(guesses[i] + " ");
				countAbove++;
			}
			
			
		}
		
		System.out.println();
		
		System.out.println("The count of guesses above average: " + countAbove);
		
		
		// Array examples:
		
		byte [] byteArr = new byte [10];
		
	//	byteArr [0] =  3456;
		
//		double doub = 8.9;
		
		double [] doubArr = new double  [200];
		
//		doubArr [2] =  32675653265153L;
		
	//	double [] doubArr2 = new int [200]; ype mismatch: cannot convert from int[] to double[]
		
		
		
		//Array size is fixed, once you create it with ceratin size, you cannot change it
		
	//	boolean  [] bools = new boolean [] ; compiler error -> length must be provided
		
		int length = 5;
		
		boolean  [] bools = new boolean [length];  // When we create an array the number in sqaure brackets( [i] )is the
											// actual size
		
//		bools[length]  = true;  // will result in ArrayIndexOutOfBoundsException because the last index is 4
		
		
		
//		float [] f = new float [Integer.MAX_VALUE]; //OutOfMemoryError: Requested array size exceeds VM limit
		
//		float [] f = new float [1000000000];
		
		
	//	short [] sh = new short [0]; //array can have a zero length, which is going to be an empty array
		
	//	sh [0] = 56;
		
		
//		char [] ch = new char [1] ; // throws NegativeArraySizeException
//	    ch [-1] = 's'; //ArrayIndexOutOfBoundsException
		
		
		
		boolean[] arr1 = new boolean [10];
		
		arr1[0] = true;
		
		System.out.println(arr1); // [I@15db9742 ->  hashcode -> it is a memory address of that object 
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		String [] names = new String [5]; 
		
		names [4] = "Fuad";
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		
		char [] chars = new char [10];
		chars[3] = 'x';
		
		for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);
		}
		
		
		
		
		String [] studentNames = {"Fuad", "Djamoliddin", "Furkan", "Nihal", "Burcu", "Fatih", ""};
		
		
		System.out.println(studentNames.length);
		
		
		
		
		String str = "Talk is cheap. Show me the code";
		
		char[] charcters = str.toCharArray(); // converts the String into an array of characters
		
		
		System.out.println(Arrays.toString(charcters));
		
		
		String[] words = str.split(" ");
		
		System.out.println(Arrays.toString(words));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
