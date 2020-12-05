package warmup;

public class CommonErrors {

	public static void main(String[] args) {

		double radius = -1;
		double area = 0;

		if (radius >= 0) 
			area = radius * radius * Math.PI;
			
		System.out.println("The area is " + area);
		

		String name = "Lion";
		int score = 100;
		
		if (name.equals("Lio"));
			score = 200;
			name = "Larry";
//		
	System.out.println(score);		
//			else
//			score = 129;
	
	
	boolean isOnline = false;
	
	if(isOnline) {
		System.out.println("You are missing the pizza");
	}else {
		System.out.println("Enjoy the pizza!");
	}
	
	double n = 1.0 - 0.3 - 0.2;
	
	System.out.println(n);
	
	System.out.println(n == 0.5);
	
	
	

	}
	
	

}
