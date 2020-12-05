package cssvag;

import java.util.Scanner;

public class Review2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			
			for (int k = 8; k >= i; k--) {
				System.out.print("  ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print( j + " " );
			}
			System.out.println();
		}

	}
	// TODO Auto-generated method stub

}
