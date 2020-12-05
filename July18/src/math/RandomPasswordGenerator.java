package math;

public class RandomPasswordGenerator {

	public static void main(String[] args) {
		// Create a program that generates a random password
		// in the form of 3 lowercase letters and 2 numbers
		//Ex. asg34, saa78, sgq44, sac12, aae25
		
		//Generate 3 random chars. Use ASCII for range
		//Generate 2 random numbers
		//Concatenate all 5 into one and print out
		
		int randomNumber1 = (int)(Math.random() * 10) ;
		int randomNumber2 = (int)(Math.random() * 10) ;
				
		int randomNumber3 = 97 + (int)(Math.random() * 26);
		
		char randomChar1 = (char)randomNumber3;
		
		
		char randomChar2 = (char)(97 + (int)(Math.random() * 26)); 
		
		char randomChar3 = (char)(97 + (int)(Math.random() * 26)); 

		System.out.println("" + randomChar1 + randomChar2 + 
				randomChar3 + randomNumber1 + randomNumber2);		
		


		
		

	}

}
