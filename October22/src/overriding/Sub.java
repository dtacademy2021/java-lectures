package overriding;

public class Sub extends Super{
	
	
	public void m1() { // method signature(name+parameter)
	
	}
	
	
	
	
	public void m2(int i) {} // not overriding but overloading
	
	
	
	
	
	// void m3() {} //Cannot reduce the visibility of the inherited method from Super


	 
     protected  void m4() {}
     
    //private void m5() {}
     
     
     private void m6() {}
    
    // public int m7() { can't override void with non-void
//     return 6;
//     } 
     
     public double m8() {
		return 9;
	}
     
//    public int m9() {
//		return 9;
//	} 
     
     public Short m10() {
 		return 9;
 	}
     
     
     public Object m11() {
 		return 9;
 	}
     
     public Employee m12() {
 		return null;
 	}
     
     

}
