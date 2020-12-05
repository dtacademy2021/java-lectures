package arrays;

public class LinearSearchDemo {

	public static void main(String[] args) {
		// Find a value in an array using a linear search approach
		
		
		int [] b = {56,33,11,23,32,43,45,56,57,56};
		
		
		
		
		int key = 56;
		
		int index = -1;
		
		int count = 0;
		
		for (int i = 0; i < b.length; i++) {
			
			if(b[i]==key) {
				index = i;
				break;
			}
			
		}
		
		
		System.out.println("The key " + key + " is found at index " + index);
		
		
		// Binary search algorithm
		
		//int key = 7;
		
		
//		int [] arr = {1,2,3,4,5,6,7,8,9,10,11};
//		
//		
//						{7,8,9,10,11}
//						
//						{7,8}
//		
		
	//	int [] b = {11,23,32,33,43,45,56,56,56,57};
		
		
		

	}

}
