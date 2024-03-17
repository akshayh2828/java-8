package fninter;

public class Test implements FuntionalInterfaces
{

	@Override
	public void add(int a, int b) {
		
		
	}
	
	@Override
	public void akshay()
	{
		
	}
	
	public static void main(String[] args) {
		FuntionalInterfaces itadd= (a,b)-> System.out.println(a+b);
		itadd.add(20, 30);
		itadd.akshay1();
		itadd.akshay1();
	
}
}
