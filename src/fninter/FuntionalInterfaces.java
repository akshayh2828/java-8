package fninter;

@FunctionalInterface
public interface FuntionalInterfaces 
{
	public void add(int a, int b);
	
	default void akshay()
	{
		System.out.println("hello akshay");
	}
	default void akshay1()
	{
		System.out.println("hello akshay1");
	}
	static void akshay2()
	{
		System.out.println("hello static method akshay");
		
	}
}
