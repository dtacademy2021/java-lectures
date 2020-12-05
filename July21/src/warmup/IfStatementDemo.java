package warmup;

public class IfStatementDemo {

	public static void main(String[] args) {
		
		
		double area, radius, pi;
		
		area  = 0;
		radius = -1;
		
		pi  = 3.14;
		
		
		if (radius >= 0)  {
			area = radius*radius*pi;
			System.out.println("The area is: " + area);
		}
		
		System.out.println("After the if statement");
		
		
		if (area > 100) {
			System.out.println("Area is greater than 100");
		}
		
		
		int num = 45;
		
		
		if( num > 50) {
			num++;
		}
		
		System.out.println(num);
		
		
		
		int num2 = 67;
		
		if (num2 > 100) { 
			System.out.println(num2);
			
		System.out.println("Another statement");
		System.out.println("Yet Another statement");
	
	}	
		
		
		
		
		

		
		

	}

}
