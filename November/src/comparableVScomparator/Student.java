package comparableVScomparator;

public class Student  implements Comparable<Student>{
	
	int id;
	int age;
	int grade;
	String name;
	
	public Student(int id, int age, int grade, String name) {
		super();
		this.id = id;
		this.age = age;
		this.grade = grade;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		return this.getName().compareTo(o.getName());
			
		}

				
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", grade=" + grade + ", name=" + name + "]";
	}
	
	
	
	
	
	

}
