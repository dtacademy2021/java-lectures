package immutability;

public class MyString {
	
	
	private String val;
	
	
	public MyString(String val) {
		this.val = val;
	}
	
	
	
	

	
	
	public void concat(String newVal) {
		
		val = val+newVal;

	}







	
	public String toString() {
		return val;
	}
	
	
	

}
