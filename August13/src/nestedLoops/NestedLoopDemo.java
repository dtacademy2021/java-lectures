package nestedLoops;

public class NestedLoopDemo {

	public static void main(String[] args) {


		for (int i = 1; i <= 10000; i++) {
			
			System.out.print("Outer loop starts:   ");
			
			for (int j = 1; j <= 10000; j++) {
				
					for (int k = 0; k < 10000; k++) {
						System.out.print(k + " ");
						
					}

				
			}
			
			System.out.println("    Outer loop ends");
			
			
		}

	}

}
