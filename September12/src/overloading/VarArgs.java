package overloading;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {

//		method1(2, 2, 12);

		method2(2);
		method2(2, 23);
		method2(2, 23);

		method2(2, 23, 34, 2, 23, 34, 2, 23, 34, 2, 23, 34, 2, 23, 34, 2, 23, 34, 2, 23, 34, 2, 23, 34);

		method2();

		method3(new int[] { 2, 3, 4 });
		
		method5(3);

	}

	public static void method1(int a, int b, int c) {
		System.out.println("Method with 3 args");
	}

	public static void method2(int... numbers) {

		System.out.println(Arrays.toString(numbers));
	}

	public static void method3(int[] numbers) {

		System.out.println(Arrays.toString(numbers));
	}

	
	
//	public static void method4(int... numbers, double... count) {
//      Only one varargs parameter is allowed in method parameter list
//	}
	
	public static void method5( int y, int... numbers) {
//      Only one varargs parameter is allowed in method parameter list
	    System.out.println(y);
	    System.out.println(Arrays.toString(numbers));
	}

}
