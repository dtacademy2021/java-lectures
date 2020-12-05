package abstarction2;

 public abstract  class Animal {
	 
	 //public abstract final class Animal  
	 //abstract classes and methods cannot be final because they are designed to be subclassed or overridden
	
	//public final abstract void m1();
	 
	//abstract methods cannot be private or final 
	// private  abstract void makeNoise(); 
	
	public  abstract void makeNoise();
	public  abstract void sleep();

}
