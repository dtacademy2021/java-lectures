package abstarction;

import java.util.ArrayList;
import java.util.List;

public class Tester {
	
	public static void main(String[] args) {
		
		
		Circle c = new Circle();
		Triangle t = new Triangle();
		//Shape sh = new Shape(); //Cannot instantiate the type Shape
		
		Shape sh1 = new Circle();
		
		m1(new Circle());
		m1(new Triangle());
		m1(null);
		//m1(new RightTriangle());
//		m1(new Shape());
		
		Object o = new String();
	//	m2(new Shape());
		
		List<Shape> list = new ArrayList<>();
		
		list.add(new Circle() );
		list.add(new Triangle() );
	//	list.add(new RightTriangle() );
		list.add(null);
		
		
		Shape[] shs = new Shape[2];
		
		//shs[0] = new Shape();
		shs[1] = new Circle();
		
		
		
	}
	
	
	
	public static void m1(Shape sh) {
		System.out.println("Shapes");
	}
	
	
	public static void m2(Object o) {
		
	}
	
	

}
