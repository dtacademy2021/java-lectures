package constructors;

public class DuotechStudent {

	long id;
	boolean isOnline;
	String name;
	int batchNo ;
	String email;
	String phone;
	
	public DuotechStudent() {
		
	}
	

	
	public DuotechStudent(String newName) {
		name = newName;
	}
	
	public DuotechStudent(long newId, boolean newIsOnline, String newName,
			                int newbatchNo, String newEmail, String newPhone) {
		
		id = newId;
		isOnline = newIsOnline;
		name = newName;
		batchNo = newbatchNo;
		email = newEmail;
		phone = newPhone;
	}
	

	public void getCertified() {
		System.out.println(name + " from batch " + batchNo + " got certified");
	}

	public void useSlack() {
		System.out.println(name + " from batch " + batchNo + " is posting a message on Slack");
	}

	public void haveQuiz() {
		System.out.println(name + " from batch " + batchNo + " is taking a quiz");
	}

	public void useCodelab() {
		System.out.println(name + " from batch " + batchNo + " is solving a CodeLab problem");
	}

	

}
