package warmup;

public class Swap2Chars {

	public static void main(String[] args) {
		
		
		char charOne = 'a';
	    char charTwo = 'z';
	    
	    char temp = charOne;
	    
	    charOne = charTwo; // 
	    
	    charTwo = temp;
	    
	    System.out.println("charOne:" + charOne);
	    System.out.println("charTwo: " + charTwo);
	    
	    
	    
	    //Swap without 3rd variable
	    
	    char char3 = 'b'; //98
	    char char4 = 'y'; //121
	    
	    char3 = (char)(char3 + char4);
	    char4 = (char)(char3 - char4) ;
	    char3 = (char)(char3 -char4);
	    
	    System.out.println("char3:" + char3);
	    System.out.println("char4: " + char4);
	    
	    boolean a = false;
	    boolean b = false;
	    if(false)
	    	System.out.println("Java");
	    else
	    	System.out.println("Not");
	    
	    
	    
	    char someChar = 'X';
	    
	    System.out.println('y' + 6);
	    
		
		
	    
	    

	}

}
