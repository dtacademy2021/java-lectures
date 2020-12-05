package package2;

import package1.Casino;

public class DiffPackageTester {
	
	public static void main(String[] args) {
		
		Casino cs = new Casino();
		
		System.out.println(cs.name);
		
		cs.getName();
		
	//	System.out.println(cs.address);
		//The field address is not visible
	//	cs.getAddress();
		
	//	System.out.println(cs.jackpotWinners);
		//The field Casino.jackpotWinners is not visible	
	
		//cs.getJackpotWinners();
	
	}

}
