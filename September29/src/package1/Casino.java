package package1;

public class Casino {
	
	public String name = "MGM"; // public modifier makes the variable to be visible from everywhere (in the project)
	
	String address;  // default modifier -> omitting the modifier
	
	private double cashAssets;
	
	private String [] jackpotWinners;
	
	// Java has 4 access/visibility modifiers: public, protected, default (package-private), private 
	
	// public -> visible to every class in this project
	// default -> visible only within the package 
	// private -> visible only within the same class
	
	public String getName() {
		getJackpotWinners();
		
		return name;
	}
	
	String getAddress() {
		return address;
	}
	
	
	
	private String[] getJackpotWinners() {
		return jackpotWinners;
	}
	
	
	
	public static void main(String[] args) {
		
Casino cs = new Casino();
		
		System.out.println(cs.name);
		
		cs.getName();
		
		System.out.println(cs.address);
		
		cs.getAddress();
		
		System.out.println(cs.jackpotWinners);
		
		cs.getJackpotWinners();
		
		
		
		
	}
	
	
	
	
	

}
