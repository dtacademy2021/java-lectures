package loops;

public class FizzBuzzInterviewQuestion {

	public static void main(String[] args) {
		//Write a program that prints the numbers from 1 to 100. 
		//But for multiples of three print "Fizz" instead of the number 
		//and for the multiples of five print "Buzz". 
		//For numbers which are multiples of both three and five print "FizzBuzz".
		//

		int counter = 1;
		while (counter <= 100) {

			if ((counter % 3 == 0) && (counter % 5 == 0)) {
				System.out.println("FizzBuzz");
			} else if (counter % 5 == 0) {
				System.out.println("Buzz");
			} else if (counter % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(counter);
			}

			counter++;

		}
		
		// 3 components of a loop:
		// Starting point: Initialization value -> int count = 0
		//Ending point: -> condition of the loop needs to eventually become false -> count < 100
		//Increment/Decrement -> counter should be there to increment/decrement (track) the number of iterations
		// count++;
	}

}
