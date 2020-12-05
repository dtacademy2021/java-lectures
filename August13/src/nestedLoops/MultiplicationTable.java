package nestedLoops;

public class MultiplicationTable {

	public static void main(String[] args) throws InterruptedException {


		
		for (int i = 1; i <= 9; i++) {
			
			System.out.print(i + " |\t");
			
			for (int j = 1; j <= 9; j++) {
				
				System.out.print(i*j + "\t");
				Thread.sleep(100);
				
			}
			System.out.println();
			
		}
		

	}

}
