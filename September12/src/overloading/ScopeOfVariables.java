package overloading;

public class ScopeOfVariables {
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		int i = 10;
		
		

	}

	public static void myMain(int number) {
		
		int j = 9;
		
		for (int i = 0; i < 4; i++) {
			
		}
		
		
		
		
	

	}

	public static void myMain2(int i) {
		
//		int i ;
		
		 {   
			System.out.println("Hi"); 
			int j = 9;
			
			 
		 }
		
		 System.out.println(i);
		
		int j = 9;
		
		

	}

}
