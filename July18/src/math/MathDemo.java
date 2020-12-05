package math;

public class MathDemo {

	public static void main(String[] args) {
		
		
		
	//	System.out.println(Math.random());
		
	//	Math.random(); // static methods are called by Classname.methodname();
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		System.out.println(Math.pow(2, 10));
		
		System.out.println(Math.round(3.6));
		System.out.println(Math.ceil(3.6));
		System.out.println(Math.floor(3.6));
		
		
//		int cents = (int)(10.03 * 100);
//
//		System.out.println(cents);

		long cents = Math.round(10.03 * 100);

		System.out.println(cents);
		
		System.out.println(Math.sqrt(43));
		
		
		System.out.println(Math.max(34, 2));
		
		int result = Math.max(34, 2);
		
		System.out.println(result);
		
		System.out.println(Math.abs(1.23));
		
		
		double randomNo = Math.random();
		
		
		
		

	}

}
