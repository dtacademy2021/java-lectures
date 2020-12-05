package warmup;

public class LoopLabels {

	public static void main(String[] args) {
		
		
	OUTER:for (int i = 1; i <= 10; i++) {
			
			
		INNER:for (int j = 1; j <= 10; j++) {
			
				if(i==3 && j==5)
				break OUTER;
				System.out.print(i*j + "\t");
				
			}
			
			System.out.println();
			
		}
	
	
	outer: while (5>1) {
		
		while (2<5) {
			break outer;
		}
	}
		
		
	outer:	do {
			while (true) {
				break outer;
			}
		} while (2<5);



	}

}
