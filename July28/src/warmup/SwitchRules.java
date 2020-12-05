package warmup;

public class SwitchRules {

	public static void main(String[] args) {


		
		int num = 8;
	
		int someValue = 8;
		
		final int constValue = 8;
		
		switch (num ) { //Only convertible int values, strings or enum variables are permitted
		
		//case someValue: //case expressions must be constant expressions
		case 8*constValue: // in this case it is ok because some	
		System.out.println("1");
			break;
		case 8:
			System.out.println("8");
			break;
		case 4:
			System.out.println("4");
			break;
		case 65:
			System.out.println("8");
			break;
		default:
			System.out.println("No match");
		}

	}

}
