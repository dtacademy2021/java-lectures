package inheritance;

public class Rectangle extends Shape{
		
	
	double width;
	double height;
	
	
	
	public Rectangle(double width, double height,String color, boolean isFilled) {
		
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(isFilled);
		
	}



	public void calculateArea() {
		setArea( height * width);
	}



	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}


	

	
	
	
	

}
