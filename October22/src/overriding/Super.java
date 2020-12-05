package overriding;

public class Super {
	
	
	public void m1() {
		
	}
	
	
	
	
	public void m2(double d) {
		
	}
	
	
	
	public void m3() {
		
	}
	
	
	void m4() {}
	
	
	
	protected void m5() {}
	
	
	
	private void m6() {}
// private methods are not inherited thus cannot be overriden
// However, you can still re-declare the same method in subclass
// They are simply two unrelated, independent methods
	
	public void m7() {}
	
	public int m8() {
		return 9;
	}
	
	public double m9() {
		return 9;
	}
	
	public Integer m10() {
		return 9;
	}
	
	//covariant type -> Sub type
	
	
	public Integer m11() {
		return 9;
	}
	
	public Manager m12() {
		return null;
	}
}
