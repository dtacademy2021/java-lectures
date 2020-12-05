package overloading;

public class OverloadingMethods {

	public static void main(String[] args) {
		
		
		System.out.println(generateRandom(100, 200));
		System.out.println(generateRandom(true));
		System.out.println(generateRandom(10));
		System.out.println(generateRandom(10, true));
			
			


		

	}
	
	/**
	 * generates and returns random number between x and y
	 * @param beginning - starting range
	 * @param end - end range
	 * @author Duotech
	 */
	public static int generateRandom( int beginning, int end){
		
		return  beginning + (int)(Math.random() * (end - beginning));
	}
	
	/**
	 * generates and returns random character that has isUppercase parameter, 
	 * if isUppercase is true return uppercase char otherwise lowercase
	 */
	public static char generateRandom(boolean isUppercaseChar){
		
		if(isUppercaseChar) {
			return (char) (65 + (int)(Math.random() * 26));
		}else
			return (char) (97 + (int)(Math.random() * 26));
		
		
	//	return isUppercaseChar ? (char) (65 + (int)(Math.random() * 26)) : (char) (97 + (int)(Math.random() * 26)) ;
		
	}
	
	
	/**
	 * generates and returns random String of lowercase letters with given lenghth
	 */
    public static String generateRandom(int stringLength){
    	
    	String str = "";
    	
    	for (int i = 0; i<stringLength; i++) {
    		str += (char)(97 + Math.random()*26);
    		}
    	
    	
    	
    	return str;
    	
    	
    }
    
    /**
	 * generates and returns random String with given lenghth and that accepts isUppercase parameter
	 */
    
    public static String generateRandom(int stringLength, boolean isUppercaseChar){
    	String str = "";
    	if(isUppercaseChar) {
    		
        	
        	for (int i = 0; i<stringLength; i++) {
        		str += (char)(65 + Math.random()*26);
        		}
        	
        	return str;
    	}else {
    		return generateRandom(stringLength);
    	}


    	
    } 


}
