package comparableVScomparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Tester {
	
	
	public static void main(String[] args) {
		
		String[] names = {"Nihal", "Elena", "Furkan", "Fuad", "Nastya"};
		
		Arrays.sort(names);
		
		System.out.println(Arrays.toString(names));
		
		Student[] students = {new Student(4, 25, 99, "Nihal"),
								new Student(34, 32, 66, "Dilmurod"),
								new Student(2, 22, 77, "Nastya"),
								new Student(10, 34, 34, "Furkan")
								};
		
		
		Arrays.sort(students);
		
		System.out.println(Arrays.toString(students));
		
		System.out.println("Ja".compareTo("Jb"));
		
		System.out.println(new Student(4, 25, 99, "Nihal").compareTo(new Student(34, 32, 66, "Dilmurod")));
		
		//Comparator interface -> is used for specific/custom comparison for
		// We need to create a class that implements the Comparator
		
		
		List<Student> list = Arrays.asList(new Student(4, 25, 99, "Nihal"),
				new Student(34, 32, 66, "Dilmurod"),
				new Student(2, 22, 77, "Nastya"),
				new Student(10, 34, 34, "Furkan")
				);
		
		
		Collections.sort(list);
		
		
		System.out.println(list);
		
		
//		ComparatorByGrade byGrade = new ComparatorByGrade();
//		
//		Collections.sort(list, byGrade);
//		
//		System.out.println(list);
		
		Comparator<Student> byGrade = (Student o1, Student o2) -> o1.getGrade() - o2.getGrade();
		
		Collections.sort(list, byGrade);
		
		System.out.println(list);
		
		Comparator<Student> byId = (Student o1, Student o2) -> o1.getId() - o2.getId();
		
		Collections.sort(list, byId);
		
		System.out.println(list);
		
		
		
		
	}

}
