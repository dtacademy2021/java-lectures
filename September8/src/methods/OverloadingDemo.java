package methods;

public class OverloadingDemo {

	public static void main(String[] args) {
		
		
		System.out.println(max(34,34));
		
		System.out.println(max(5.6, 6.6));
		
		System.out.println(true);
		
		System.out.println("xshva");
		

	}
	
	//
	
	
	public static int max(int a, int b) {
		return a > b ? a : b;
	}
	
	
	public static double max(double a, double b) {
		return a > b ? a : b;
	}
	
	
	
	

}
