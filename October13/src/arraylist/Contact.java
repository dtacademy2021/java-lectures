package arraylist;

public class Contact {
	
	String name;
	String phoneNo;
	String email;
	String address;
	
	
	public Contact(String name, String phoneNo, String email, String address) {
		
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
		this.address = address;
	}


	
	public String toString() {
		return "Contact [name=" + name + ", phoneNo=" + phoneNo + ", email=" + email + ", address=" + address + "]";
	}
	
	
	
	
	

}
