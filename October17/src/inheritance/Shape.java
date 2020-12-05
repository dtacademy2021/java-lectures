package inheritance;

public class Shape {
	
	private double area;
	private String color;
	private boolean isFilled;
	private double perimeter;
	
	
	public Shape () {
		
	}
	
	
	
	
	public Shape(String color, boolean isFilled) {
		
		this.color = color;
		this.isFilled = isFilled;
	}




	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public boolean isFilled() {
		return isFilled;
	}


	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}


	public double getPerimeter() {
		return perimeter;
	}


	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}



	public String toString() {
		return "area=" + area + ", color=" + color + ", isFilled=" + isFilled + ", perimeter=" + perimeter + "]";
	}
	
	
	


}
