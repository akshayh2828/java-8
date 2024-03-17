package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class M1 {

	public static void main(String[] args) {
		List<Integer> ls=Arrays.asList(10,20,5);
		/*
		 * List<Integer>ls1=ls.stream().map(i->i*i).collect(Collectors.toList());
		 * System.out.println(ls1);
		 */
	List<Integer>ls2=      ls.stream().map(i->i+i).collect(Collectors.toList());
	System.out.println(ls2);

	}
}
