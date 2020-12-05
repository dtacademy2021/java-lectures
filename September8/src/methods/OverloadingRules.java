package methods;

public class OverloadingRules {

	// For overloading to be legal, the access modifier, optional specifiers
	// (static, final), return type - any of these do not matter
	// Only consideration is method names have to be the same and parameters must be
	// different

	public static void method(double y) {

	}

	private static void method(int x) { // private

	}

	public void method(float x) { // non-static

	}

	public final static void method(byte y) { // final

	}

	public static int method(short y) {
		return 0;
	}

}
