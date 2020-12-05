package reviewSession;

public class Increment {

	public static void main(String[] args) {
		
		
		//++ ->
		// ++ AND -- IS USED only with variables: i++ , number++,  6++
		// PRE-
		// POST-

		int i = 8;
		
		i++; // i = i + 1;
		
		
		
		System.out.println(i);
		
		i--;
		
		System.out.println();
		
		// PRE-INCREMENT -> ++i /PRE-DECREMENT -> --i
		// POST-INCREMENT -> i++ /POST-DECREMENT -> i--
		
		
		int someNumber = 10;
		
		someNumber++;
		
		System.out.println(someNumber); //11
		
		++someNumber;
		
		System.out.println(someNumber); //12
		
		
		int b = someNumber--; // pre -> incerement the original value first and then use it
							// post -> use the original value first and then increment it.
		
		
		System.out.println(b);
		System.out.println(someNumber);
		
		
		int z = 22;
		
		
		System.out.println(++z); //23
		
		System.out.println(z);
		
		System.out.println(z++);
		
		System.out.println(z);
		
		System.out.println(z--);
		System.out.println(z);
		
		System.out.println(++z);
		System.out.println(z);
		
		
		int x = 5;
		
		
		int y = ++x  +  x++  + --x  +  x--;
		
		
		System.out.println(y);
		System.out.println(x);
		
		
		
		
		

		
		

	}

}
