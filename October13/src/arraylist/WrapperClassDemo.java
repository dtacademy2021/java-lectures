package arraylist;

import java.util.ArrayList;
import java.util.List;

public class WrapperClassDemo {

	public static void main(String[] args) {
		// Wrapper classes -> primitives wrapped in a Class
		
		
		Integer i =  new Integer(45);
		Integer i2 = new Integer("55");
		System.out.println(i2);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		List<Integer> list = new ArrayList<>();
		
		list.add(i);
		list.add(i2);
		list.add(new Integer(34));
		
		System.out.println(list);
		
		
		Double d = new Double(23.21);
		Double d1 = new Double("23.21");
		
		Double d2 = new Double("23d");
		
		System.out.println(d2);
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		
		
		
		Float f = new Float(45.8);
		Float f2 = new Float("34.5f");
			
		System.out.println(f2);
		
		Long l   = new Long(3432663456325643L);
		
		Long l2   = new Long("343266345632564"); // With long, l/L is not allowed in the constructor that accepts String
		
		System.out.println(l2);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		Short sh  = new Short((short)32767);
		Short sh1  = new Short("32767");
		
		System.out.println(sh);
		
		System.out.println(sh1);
		
		
		Byte b  = new Byte((byte)127);
		Byte b2  = new Byte("127");
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(b);
		
		
		
		
		Boolean bl = new Boolean(true);
		
		Boolean bl2 = new Boolean("tRUE"); //case does not matter for creating Boolean object with String constructor
		
		System.out.println(bl2);
		
		Boolean bl3 = new Boolean("3t2654125781267381263217918"); // For every string other than true it will generate a boolean object with value false
		
		// because of this -> return ((s != null) && s.equalsIgnoreCase("true"));
		
		System.out.println(bl3);
		
		System.out.println(Boolean.TRUE);  // -> returns new Boolean(true) 
		System.out.println(Boolean.FALSE); // -> returns new Boolean(false) 
		
		
		Character ch = new Character('&');
		
		
		
		System.out.println(ch);
		
		System.out.println((int)Character.MAX_VALUE);
		System.out.println(Character.MIN_VALUE);
		
		

	}

}
