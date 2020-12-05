package interviewQuestions;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Just Do It!");
			System.out.println("-------------------------------");
			System.out.println("Do you want to see it again: (yes/no)");
			answer = sc.next();
		}while(answer.equals("yes"));
		
		

	}

}
