package warmup;

import java.util.Arrays;

public class TwoDimensionalArrayDemo {

	public static void main(String[] args) {
		// 

		
		
		int [][] matrix ;
		
		int [] matrix1[] , matrix3;
		
		int matrix2[][], matrix4;
		
		
		matrix3 = new int[6]; //matrix3's type is int []
		
		matrix4 = 5;  // matrix 4's type is int
		
		matrix = new int [0][0]; //-> 
		
		System.out.println(Arrays.deepToString(matrix));
		
		
		
		String [][] students = { 
				
				{"0001", "Djamoliddin", "M", "in-class"},
				{"0002", "Fuad", "M", "in-class"},
				{"0003", "Burcu", "F", "online"},
				{"0004", "Dilmurod", "M", "online", "outOfState","0004", "Dilmurod", "M", "online", "outOfState"},
				{"0005", "Furkan", "M", "online"},
				
				};
		

		students[0] = new String[] {"0001", "John", "M", "outOfState"};
		
		System.out.println(Arrays.deepToString(students));
		
		students[3][3] = "in-class";
		
		System.out.println(Arrays.deepToString(students));
		
		
		System.out.println(students.length); // the length of the outer array
		
		System.out.println(students[3].length); // the length of the inner array with index 3
		
		
		
		for (int i = 0; i < students.length; i++) {
			
			
			for (int j = 0; j< students[i].length; j++) {
				
				System.out.print(students[i][j] + " ");
				
			}
			System.out.println();
			
		}
		
		// array that has null vs empty array
		
		String [] arr1 = {null};
		String [] arr2 = {}; 
		
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		
		System.out.println(Arrays.toString(arr1));
		
		


		
		
		
		
		


		
		
		
		
		

	}

}
