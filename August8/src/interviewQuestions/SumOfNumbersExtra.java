package interviewQuestions;

public class SumOfNumbersExtra {

	public static void main(String[] args) {
		//Extra: sum of numbers divisible by 17 from 500 to 700 -> 7242
		
		
		
		int count = 500;
		
		int sum = 0;
		
		int anothercount = 0;
		
		while (count <= 700) {
			
			
		if(count % 17 == 0) {
			sum = sum + count;
		}	
		
		count++;
				
		}
		
		 System.out.println(sum);
		
		
		
		
		
		
		
		
		

	}

}
