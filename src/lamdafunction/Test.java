package lamdafunction;

import java.util.Map;
import java.util.function.BiConsumer;

public class Test {
	public static void main(String[] jsj) {
		System.out.println("hello");
		BiConsumer<Integer, Integer> ls=(a,b)->System.out.println(a+b);
		ls.accept(10, 20);
		
	
		
	}

}
