package lamda;

import java.util.function.BiConsumer;

public class Addition {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> add=(a,b)->System.out.println(a+b);
		add.accept(10, 20);
	}
}
