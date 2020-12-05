package castingOfObjects;

public class Tester {

	public static void main(String[] args) {


		
		method(new Building());
		
		method(new Hotel());
		
//		Building b = new Hotel(); --> Hotel is being upcasted to Building implicitly  (widening)
//		method(b);
		
		method(new Hospital());
		
		Building building = new Hospital();
		
	//	Building building = (Building) new Hospital(); // we can still explicitly upcast using the same syntax
		
		
		Hospital hospital = (Hospital) building; // explicit downcasting (narrowing) is required for this assignment
		
		
		
		
		Building b1 = new Hotel();
		
		
		if(b1 instanceof Hospital) {
			Hospital h1 = (Hospital)b1;
		}
		
		
		//Class cast exception occurs if the actual object of the reference variable being casted is not compatible with /assignable/ not an instance of
		// the Class of reference that you are trying to assign
		//Hotel cannot be cast to Hospital
		
		

	}
	
	
	
	public static void method(Building b) {
		System.out.println("Biulding");
	}

}
