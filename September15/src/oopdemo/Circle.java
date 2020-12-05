package oopdemo;

public class Circle {

	double radius = 1;

	public double getArea() {

		return radius * radius * Math.PI;
	}

	public double getPerimeter() {

		return 2 * radius * Math.PI;
	}

	public void setRadius(double newRadius) {

		radius = newRadius;
	}
	
	
	public double getRadius() {

		return radius;
	}
	
	

}
