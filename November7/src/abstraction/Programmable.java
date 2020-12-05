package abstraction;

public interface Programmable {
	//Interfaces are inherently abstract, compiler will insert abstract keyword for interface definition even if we omit it
	
	public static final int serialNo = 1000000;
	
	String method = ""; //public static final keywords are inserted even if we omit them
	
	double value = 3.4;
	
	
	
	public abstract void program();
	
	

	void deprogrammable() ; // public abstract keywords are inserted for all abstract methods 
	
	

}
