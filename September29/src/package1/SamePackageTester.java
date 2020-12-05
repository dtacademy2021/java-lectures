package package1;

public class SamePackageTester {
	
	
public static void main(String[] args) {
		
		Casino cs = new Casino();
		
		System.out.println(cs.name);
		
		cs.getName();
		
		System.out.println(cs.address);
		
		cs.getAddress();
		
		//System.out.println(cs.jackpotWinners);
		//The field Casino.jackpotWinners is not visible
		
		//cs.getJackpotWinners();
	}
	



	
}
