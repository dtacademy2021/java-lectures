package loops;

public class LoopExercise {

	public static void main(String[] args) {
		// Use a while loop to print out all the numbers 
		//from 500 to 1000 both inclusive
		//print out all the even numbers in one line with spaces in between them
		//Starting is 501
		// 502 504 506 ... 1000
		
		
//		int counter = 500;
//		System.out.println("Loop started");
//		while(counter <= 1000) {
//			System.out.println("The counter's value in loop number "+(counter-499) + " is: "+ counter);
//			counter++;
//		}
//		System.out.println("Loop ended");
		
		
		
		int counter = 500;
		int loopNo = 1;
		System.out.println("Loop started");
		while(counter <= 1000) {
			System.out.println("The counter's value in loop number "+ loopNo + " is: "+ counter);
			counter++;
			loopNo++;
		}
		System.out.println("Loop ended");


	}

}
