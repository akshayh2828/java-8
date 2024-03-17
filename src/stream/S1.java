package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class S1 {

	public static void main(String[] args) {
		List<Integer> ls=Arrays.asList(1,2,4,7,5,9,10,9,8);
		 List<Integer>ls1= ls.stream().filter(s->s>=5).collect(Collectors.toList());
		 System.out.println(ls1);
	}
}
