package comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
		ArrayList<Employee> marks=new ArrayList<>();
		marks.add(new Employee("akshay", "85549", 101));
		marks.add(new Employee("santosh", "8787", 99));
		marks.add(new Employee("akhilesh", "857549",45));
		System.out.println(marks);
		Collections.sort(marks);
		System.out.println(marks);
		


		
	}

}
