package comparableVScomparator;

import java.util.Comparator;

public class ComparatorByGrade implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getGrade() - o2.getGrade();
	}

}
