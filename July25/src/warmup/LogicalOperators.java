package warmup;

public class LogicalOperators {
	
	
	public static void main(String[] args) {
		
		
//		if(!false) {
//			System.out.println("Yes");
//		}else {
//			System.out.println("NO");
//		}
		
		boolean isOnline = true;
		boolean isHungry = true;
		
		if(isOnline && isHungry) {
			System.out.println("Enjoy the meal at home");
		}else {
			System.out.println("Enjoy the pizza!");
		}
		
		
		if(isOnline || isHungry) {
			System.out.println("Wait till class is finished");
		}
		
		
		if(isHungry ^ isOnline) {
			System.out.println("Bla  bla  bla exclusive ");
		}
		
		
	}

}
