package abstarction;

public class Triangle extends Shape{
	
	public Triangle() {}
	
	public Triangle(int base, int sideB, int sideC, int vertical) {
		super();
		this.base = base;
		this.sideB = sideB;
		this.sideC = sideC;
		this.vertical = vertical;
	}


	private int base;
	private int sideB;
	private int sideC;
	private int vertical;


	public double getPerimeter() {
		return base + sideB + sideC;
	}
	
	
	public double getArea() {
		return base*vertical/2;
	}
	
	
	

}
