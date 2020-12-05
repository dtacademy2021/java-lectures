package warmup;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		
		//We are going to ask the user if he/she can swim and get the input as boolean
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Can you swim?: (Enter true or false) ");
		
		boolean canSwim = sc.nextBoolean();
		
//		if(canSwim)	{
//			System.out.println("You can come to the beach with us.");
//		}else {
//			System.out.println("You have to stay home");
//		}
	
		
		
		//If there is only one statement in either if or else's body, you can omit the curly braces
		if(canSwim) 
			System.out.println("You can come to the beach with us.");
		else 
			System.out.println("You have to stay home");
		
		
		
		System.out.println("You have to relax");
		
		

	}

}
