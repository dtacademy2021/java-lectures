package mainClass;

public class Incre {

	public static void main(String[] args) {


		
		int i = 10;
		
		int newNum = 10 * i++;
		
		System.out.println(newNum);
		
		System.out.println(i);
		
		int anotherNum = i * 20;
		
		System.out.println(anotherNum);
		
		
		int a = 6;
		
		int b = a++ + ++a - a--;
		
		System.out.println(b);
		System.out.println(a);

	}

}
