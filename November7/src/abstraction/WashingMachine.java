package abstraction;

public class WashingMachine extends Appliance implements Programmable, Serviceable, Tradeinable{

	@Override
	public void turnOn() {
		System.out.println("Put detergent");
		System.out.println("Set the water temp");
		System.out.println("Press on button");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Press off button");
		
	}

	@Override
	public void setAlarm() {
		System.out.println("Set alarm with timer");
		
	}
	
	
	public  void program() {
		System.out.println("Washing machine specific programming");
	}

	@Override
	public void service() {
		System.out.println("Washing machine specific service");
		
	}

	@Override
	public void tradeIn() {
		System.out.println("Give $100");
		
	}

	@Override
	public void deprogrammable() {
		// TODO Auto-generated method stub
		
	}

	
	

	

}
