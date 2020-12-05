package interfaces;

public interface Edible extends  Devourable,Consumable{
	
	boolean hasTaste = true; //private and protected will generate compiler error
	
	
	public abstract void eat();
	
	public default void ingest() {
		System.out.println("Ingesting");
	}
	//With default methods public can be omitted
	
//	public default void someBehavior() {
//		System.out.println("Some beahvior");
//	}
	
	//default methods were introduced because of backward compatibility
	
	public default void chew() {
		System.out.println("chew-eat");
	}
	
	public static void finish() {
		System.out.println("Static method Edible interface");		
	}
	
	
	
	

}
