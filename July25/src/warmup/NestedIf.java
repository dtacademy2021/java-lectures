package warmup;

public class NestedIf {

	public static void main(String[] args) {
				
		int number = 22;
				
		if (number>=0) {
			
			if(number % 2 == 0) {
				System.out.println("The number is even");
				
				if(number < 100) {
					System.out.println("The number is less than 100");
					
					if(number < 1000) {
						System.out.println("The number is less than 1000");
					}
				}
							
			}else {
				System.out.println("The number is odd");
			}
			
			System.out.println("The number is positive");
					
		}else {
			
			if(number % 2 == 0) {
				System.out.println("The number is even");
			}else {
				System.out.println("The number is odd");
			}
			
			
			System.out.println("The number is negative");
		}


		
		
		

	}

}
