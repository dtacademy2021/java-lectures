package superKeyword;

public class Car extends Vehicle{
	
	
	boolean hasSunroof;
	int noOfDoors;
	String bodyType;
	
	
	public void drift() {
		System.out.println("Drifting");
	}
	
	
	public void selfDrive() {
		System.out.println("Self driving");
	}
	
	
	public void printVehicleClassBody(){
		System.out.println(super.bodyType);
	}
	
	public void printCarClassBody(){
		System.out.println(bodyType);
	}
	
	
	


	public String getInfo() {
		return "[hasSunroof=" + hasSunroof + ", noOfDoors=" + noOfDoors + ", bodyType=" + bodyType + "] " + 
				super.getInfo();
	}
	
	
	
	public static void main(String[] args) {


		Car c = new Car();
		
		c.bodyType = "sedan";
		
		c.printCarClassBody();
		
		c.printVehicleClassBody();
		
		
		
		System.out.println(this.getInfo());
		

	}

}
