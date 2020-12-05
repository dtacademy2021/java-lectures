package warmup;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint sum = 0;
		
	
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Pre i is: " + i);
			sum += i;
			
			if(i==5)
			continue;
			
			
			System.out.println("Post i is: " + i);				
		}
		
		System.out.println(sum);
		
		
//		if (5>1) {
//		//	continue; continue cannot be used outside of a loop
//		}
//		int i = 9;
//		
//		switch (i) {
//		case 1:
//			
//			continue; //	continue; continue cannot be used outside of a loop
//
//		default:
//			break;
//		}
		

	}

}
