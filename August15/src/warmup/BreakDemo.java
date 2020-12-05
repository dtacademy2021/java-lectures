package warmup;

public class BreakDemo {

	public static void main(String[] args) {
		
		int sum = 0;
		
		int count = 0;


		for (int i = 1; i <= 5; i++) {
			
			System.out.println("Count: " + count);
			sum += i;
			
			
			
			
			if(sum==15)
			break;
			
			count++;
			
			
		
			
		}
		
		System.out.println(sum);
		
		System.out.println(count);
		
	//	break; break cannot be used outside of a loop or a switch
		
//		int count = 0;
		
//		while(true) {
//			
//			
//			count+=3;
//			
//			if(count==66) 
//				break;
//			
//		}
		
//		System.out.println(count);
		

	}

}
