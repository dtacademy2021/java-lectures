package superKeyword;

public class Vehicle {
	
	int yearBuilt;
	String model;
	String make;
	boolean hasTires;
	String bodyType;
	
	
	public int getYearBuilt() {
		return yearBuilt;
	}
	public void setYearBuilt(int yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	
	public void accelerate() {
		System.out.println("Accelerating");
	}
	
	
	public String getInfo() {
		return "[yearBuilt=" + yearBuilt + ", model=" + model + ", make=" + make + ", hasTires=" + hasTires
				+ ", bodyType=" + bodyType + "]";
	}
	
	
	
	

}
