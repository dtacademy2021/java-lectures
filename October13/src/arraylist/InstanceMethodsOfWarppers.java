package arraylist;

public class InstanceMethodsOfWarppers {

	public static void main(String[] args) {


		Integer i = new Integer("45");
		
		byte b = i.byteValue();
		short shortValue = i.shortValue();
		double doubleValue = i.doubleValue();
		
		System.out.println(doubleValue);
		
		long longValue = i.longValue();
		float floatValue = i.floatValue();
		int intValue = i.intValue();
		
		
		Double d = new Double(45.78);
		
		System.out.println(d.intValue());
		
		
		String num = d.toString();
		
		System.out.println(num);
		
	//	Double d1 = new Double(); There is no no-arg constructor for Wrappers
		
		
		
		
		
		


		
		
		
		
		

	}

}
