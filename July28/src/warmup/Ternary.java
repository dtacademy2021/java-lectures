package warmup;

public class Ternary {

	public static void main(String[] args) {
		
		
		int bill = 5000;
		int discount = 0;
		
//		if(bill > 2000) {
//			discount = 15;
//		}else {
//			discount = 10;
//		}
		
		discount = (bill>2000) ?  15 : 10 ;   // (condition) ? ( true) : (false)
		
		
		System.out.println(discount);
		
		
		
		////////////////////////
		int num = 15;
		
//		if(num % 2 == 0) {
//			
//			if(num > 0) {
//				System.out.println("Positive");
//			}else {
//				System.out.println("Negative");
//			}

//		}else {
//			System.out.println("The number is odd");
//		}
		
//		String result = (num % 2 == 0) ? "The number is even" : "The number is odd";
//		
//		System.out.println( result);
		

		
//		System.out.println( (num % 2 == 0) ? num > 0 ? "Positive": "Negative" : "The number is odd");

		//if(num % 2 == 0) {
//			
//			if(num > 0) {
//				System.out.println("Positive");
//			}else {
//				System.out.println("Negative");
//			}

//		}else {
//			System.out.println("The number is odd");
//		}

		
		System.out.println( num % 2 == 0 ? num > 0 ? "Positive": "Negative" : num % 5 == 0 ? "Divisible by 5" : "Not divisible by 5");

	}

}
