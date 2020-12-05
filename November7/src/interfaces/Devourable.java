package interfaces;

public interface Devourable {
	
	public abstract void consume();
	
	
	public default void chew() {
		System.out.println("chew-devour");
	}

}
