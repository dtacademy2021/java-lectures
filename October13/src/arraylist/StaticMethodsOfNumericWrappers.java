package arraylist;

public class StaticMethodsOfNumericWrappers {

	public static void main(String[] args) {
		
		
		//PARSE -> Convert String into a Number
		
		String price = "64900.90"; 
		String leatherPacakge = "3995";
		String total = "$68,895".replace("$", "").replace(",", "");
		System.out.println(total);
		
		double numPrice = Double.parseDouble(price);
		int numLeatherPack = Integer.parseInt(leatherPacakge);
		int numtotal = Integer.parseInt(total);
		
		
		
		if(numtotal == numPrice + numLeatherPack) {
			System.out.println("Test passed");
		}else {
			System.out.println("Test failed");
		}
		
		
		
		
		double parseDouble = Double.parseDouble("56.8");
		Double nu = Double.valueOf("67.8");
		
//		 Integer ;
		
		


		
		

	}

}
