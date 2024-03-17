package pattern;

public class P1 
{
	public static void main(String[] args) {
		
		FinInterface total=(a,b)->a*b;
		System.out.println(total.multiple(10,5));
}
}