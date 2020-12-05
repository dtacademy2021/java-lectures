package warmup;

public class PrintChars {

	public static void main(String[] args) {
		// Use for loop to print all the characters from '$' to '~' by 10 characters each line
		
		int count = 1;
		for (char i = '$'; i <= '~'; i++) {
			
//			System.out.print(i + "\t");
//			
//			if(count % 10 == 0) {
//				System.out.println();
//			}
//			count++;
			
			

			
			if(count % 10 == 0) {
				System.out.println(i);
			}else {
				System.out.print(i + "\t");
			}
			count++;
			
		}
		
	}

}
