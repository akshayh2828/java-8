package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringOccirence 
{
	public static void main(String[] args) {
		List<Integer> ls=Arrays.asList(10,28,87,10,20,76,28,80,80,80);
		
		Set<Integer> set=new HashSet<>();
		ls.stream().filter(x->set.add(x)).forEach(x->System.out.println(x));
	}

}
