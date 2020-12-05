package loops;

public class LoopExercisePrintEven {

	public static void main(String[] args) {
		
		
		
		
		int counter = 501;
		
		System.out.println("Loop started");
		
		while(counter <= 1000 ) {
			
			if(counter % 2 == 0) {
				System.out.print( counter + " ");
				
			}
			
			counter++;
			
		}
		
		System.out.println("Loop ended");


	}

}
