package array;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducemethod {
	public static void main(String[] args) {
		List<Integer> ls=Arrays.asList(10,20,30,40,50);
	int sum=ls.stream().reduce((a,b)->a+b).get();
	System.out.println(sum);
		
	}

}
