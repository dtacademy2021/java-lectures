package inheritance;

public class Circle extends Shape{
	
	double radius;
	
	
	
	public Circle() {
		
	}
	
	
	public Circle(double radius, String color, boolean isFilled) {
		
		this.radius = radius;
		setColor(color);
		setFilled(isFilled);
		
	}



	public double getRadius() {
		return radius;
	}



	public void setRadius(double radius) {
		this.radius = radius;
	}



	
	
		
	
	public void calculateArea() {
		setArea( Math.PI * radius * radius);
	}



	
	
	
	

}
