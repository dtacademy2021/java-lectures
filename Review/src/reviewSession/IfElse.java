package reviewSession;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// 3 types:

		// 1. if(condition){}
		// == -> checks if values at both sides are equal

		if ((6 + 12) == 18) {
			System.out.println("Execute");
			System.out.println("Execute");
			System.out.println("Execute");
			System.out.println("Execute");
			System.out.println("Execute");
			System.out.println("Execute");
			System.out.println("Execute");
		}

		System.out.println("After if statement");

		// if - else

		if ((6 + 13) == 18) {
			System.out.println("If body");
		} else {
			System.out.println("Else body");
		}

		// if - else if - else if - else
		
		Scanner sc = new Scanner(System.in);
		
		String browser = sc.next();

		
		if (browser.equals("chrome")) {
			System.out.println("initializing CHROME");
		} else if (browser.equals("firefox")) {
			System.out.println("initializing FIREFOX");

		} else if (browser.equals("opera")) {
			System.out.println("initializing OPERA");

		}else if (browser.equals("safari")) {
			System.out.println("initializing SAFARI");
		}else {
			System.out.println("No such browser");
		}

	}

}
