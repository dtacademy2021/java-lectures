package mainClass;

public class CastingDemo {

	public static void main(String[] args) {


		double d = 45; // widening an int to double
						// implicit casting
		
		System.out.println(d);
		
		
		int i = (int) d; // explicit casting of double to int
		
		System.out.println(i);
		
		
		int j = ( int ) 66.8;
		
		
		System.out.println(j);
		
		
		byte b = 7;
		
		short sh = b;
		
		float f = sh;
		
		double d2 = 78.9;
		
		
		byte b2 = (byte)d2;
		
		System.out.println(b2);
		
		
		
		double d3 = 127.8;
		
		byte b3 = (byte)d3;
		
		System.out.println(b3);
		
		
		char c = 'B';
		
		byte num = (byte) c;
		
		System.out.println(c);
		
		
		
		
		

	}

}
