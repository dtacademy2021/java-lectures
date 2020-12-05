package warmup;

public class Palindrome {

	public static void main(String[] args) {
		// Write a program that checks if the word is a palindrome
		// PALINDROME -  a word that reads the same from both ends -> dad, mom, civic, levol, tattarrattat, detartrated.

		//1st solution -> Create a reversed version and check it with the original
		
		String word = "tattarrattar";
		
		//Create 2 variables to track the indexes from both ends
		//Inside a loop continuously check characters from both ends and increase/decrease the index
		
		
		int start = 0;
		int end = word.length()-1;
		
		boolean isPalindrome = true; //boolean flag to track the value of isPalindrome
		
		
		while(start<end) {
			
			if(word.charAt(start) != word.charAt(end)) {
				isPalindrome = false;
				break;
			}
						
			start++;
			end--;
			
			
		}
		
		System.out.println("The word is" + (isPalindrome ? "" :  " NOT" )+  " a palindrome" );
		
		
		
		
		
	}

}
