package warmup;

public class ShortCircuit {

	public static void main(String[] args) {
		// T

		int x = 1;
		
	//	boolean b = false && (++x > 0);  & -> ampersand,  | -> pipe
		
		
		boolean b1 = (++x > 1) && (++x > 0); 
		
		//System.out.println(b1);
		//System.out.println(b1);
		
		System.out.println(x);
		
		
		// for  && if the first part of the expression is false then the rest is not evaluated
		
		// for  ||  if the first part of the expression is true then the rest is not evaluated

		

	}

}
