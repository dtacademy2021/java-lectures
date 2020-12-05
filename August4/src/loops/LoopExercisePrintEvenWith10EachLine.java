package loops;

public class LoopExercisePrintEvenWith10EachLine {

	public static void main(String[] args) {
		
		//Print 10 numbers on each line
		//502 504 506 508 510 512 514 516 518 520
		//522 524 526 528 530 532 534 536 538 540
		//542 544 546 548 550 552 554 556 558 560
		//...
		//982 984 986 988 990 992 994 996 998 1000
		
		//
		
		
		int counter = 501;
		
	
		
		while(counter <= 1000 ) {
			
			if(counter % 2 == 0) {
				
								
				System.out.print( counter + " ");
				
				//add condition that checks if the counter is divisible by 20
				//println
				
				if(counter % 20 == 0) { // to print 10 numbers on each line
					System.out.println();
				}
				
			}
			
			counter++;
			
		}
		
		


	}

}
