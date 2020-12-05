package warmup;

public class ModuloAndDivision {

	public static void main(String[] args) {

		
		//Get the time in milliseconds
		//

		long milliseconds = System.currentTimeMillis(); //amount of milliseconds since 
														//Epoch time
		
		
		//Extract the number of days // 1 day = 86400000 ms
		
		long days = milliseconds/86400000;
		
		
		
		long remaining = milliseconds % 86400000;
		
		long hours = remaining / 3600000;
		
		
		
		remaining = remaining % 3600000;
	
		
		long minutes = remaining / 60000;
		
		
		
		remaining = remaining % 60000;
		
		long seconds = remaining / 1000;
		
		
		
		long remMilliseconds = remaining % 1000;
		
		System.out.println(days + " days, " +
						   hours + " hours, " +
						minutes + " minutes, " + 
						   seconds + " seconds and "+ 
						 remMilliseconds + " milliseconds have passed since "
						 		+ "January 1st, 1970"
						 );



	}

}
