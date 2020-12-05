package abstarction;

public class Circle extends Shape{
	
	double radius;

	
	
	
	
	
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	

}
