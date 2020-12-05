package abstarction;

public abstract class Shape {
	
	protected String color;
	protected boolean isFilled;
	
	
	protected Shape() {
	
	}
	
	protected Shape(String color, boolean isFilled) {
		super();
		this.color = color;
		this.isFilled = isFilled;
	}
	
	

	//Abstraction principle helps the programmer to provide behavior without showing the implementation details and enforce the concrete subclasses
	// to provide implementation
	
	//Abstraction -> hiding implementation details and providing general behavior
	//Abstraction can be achieved in Java via Abstract Classes and Interfaces
	//Why? -> less coding, DRY principle, maintainability, reduce complexity
	//Encapsulation -> data hiding (properties, variables)
	//Abstraction -> implementation hiding (behavior, methods)
	
	public abstract double getPerimeter();
	
	public abstract double getArea();

}
