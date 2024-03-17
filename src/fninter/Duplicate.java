package fninter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate {

	public static void main(String[] args) {
		List<Integer> ls=Arrays.asList(1,5,7,4,6,9,11,78,65,78);
	      List<Integer>ls1=ls.stream().sorted().collect(Collectors.toList());
	      System.out.println(ls1);
	      Object[] arr= ls1.toArray();
	      int size=arr.length;
	       System.out.println(arr[size-1]);
	}
}
