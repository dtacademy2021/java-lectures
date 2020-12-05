package interfaces;

public interface Consumable {
	
	
	public abstract void consume();
	
	public default void chew() {
		System.out.println("chew-consume");
	}

}


