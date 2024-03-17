package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Count {

	public static void main(String[] args) {
		List<Integer> ls=Arrays.asList(54,20,10,20,30,70,50);
	    long ls1=	ls.stream().count();
	    System.out.println(ls1);
	    List<Integer>ls2=ls.stream().sorted().collect(Collectors.toList());
     	System.out.println(ls2);
     	
     	 
	
	}
}
 