package superKeyword;

public class OnlineStudent extends Student{
	
	boolean fullOnline;
	final boolean requiresStreaming = true;
	
	// super must be the first statement in a constructor
	
	
	// super() and this() cannot be in a same constructor
	
	// every constructor in java will have implicit super() call if we don't insert this() or custom super() statement in a constructor
	
	public OnlineStudent(int id, String name, String email, String address, boolean fullOnline) {
		
		this();
			
		this.fullOnline = fullOnline;
		
	}
	
	public OnlineStudent() {
		
		//It is a good practice to add no argument constructor if your class is meant to be subclassed 
		// Otherwise, each subclass constructor is forced to call another constructor explicitly.
				// super(); Implicit super constructor Student() is undefined. Must explicitly invoke another constructor
		
		
	}

	
	
	public OnlineStudent(boolean fullOnline) {
		super();
		
		this.fullOnline = fullOnline;
	}
	
	
	
	
	
	
	

}
