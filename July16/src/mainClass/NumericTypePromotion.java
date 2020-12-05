package mainClass;

public class NumericTypePromotion {

	public static void main(String[] args) {

		//Java automatically promotes each byte, short, or char 
		//operand to int when evaluating an expression.
		
		
		byte b1 = 78;
		byte b2 = 12;
		
		byte b3 = (byte)(b1 +  b2); //automatic type promotion
		
		
		short sh =56;
		short sh1 = 67;
		short sh2 = (short)(sh * b3);
		
		
		double d = 56;
		
		

		int d2 = (int)(87D + sh + b3);
		
		
		float f1 = (float)(87.0 / 23);
		
		
		
		double l = 56D + 7.8F + 3L;
		
		
		
		
		
		int z = 30;
		
		
		int x =  z++ + ++z - --z + z-- - ++z; 
		
		System.out.println(x);
		System.out.println(z);
		
		
		
		
		

	}

}
