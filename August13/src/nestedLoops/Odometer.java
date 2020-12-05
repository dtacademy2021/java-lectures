package nestedLoops;

public class Odometer {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		for (int thousand = 0; thousand < 10; thousand++) {
			
			for (int hundred = 0; hundred < 10; hundred++) {
				
				for (int ten = 0; ten < 10; ten++) {
					
					for (int one = 0; one < 10; one++) {
						
						System.out.print(""+ thousand + hundred + ten + one + "\r");
						Thread.sleep(100);
						
					}
					
				}
				
			}
			
		}

	}

}
