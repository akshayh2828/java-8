package comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<Emp> marks=new ArrayList<>();
		marks.add(new Emp("akshay", "85549", 101));
		marks.add(new Emp("santosh", "8787", 99));
		marks.add(new Emp("akhilesh", "857549",45));
		Collections.sort(marks,new IdComrator());
		//System.out.println(marks);
		ArrayList<Emp> mark1=new ArrayList<>();
		mark1.add(new Emp("akshay", "85549", 101));
		mark1.add(new Emp("santosh", "8787", 99));
		mark1.add(new Emp("akhilesh", "857549",45));
		Collections.sort(mark1,new NameComparator());
		System.out.println(mark1);
	}

}
