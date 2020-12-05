package warmup;

public class SortThreeNumbersBySwapping {

	public static void main(String[] args) {
		
		int a = 5;
		
		int b = 1;
		
		int c = -6;
		
		System.out.println("a: " + a + " b: " + b + " c:"+ c);
		
		
		
		
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
			
		}
		
		
		if (b > c) {
			int temp = b;
			b = c;
			c = temp;
		}
		
		
		
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
			
		}
		
		System.out.println();System.out.println("a: " + a + " b: " + b + " c:"+ c);


		

	}

}
