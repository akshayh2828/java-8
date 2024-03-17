package predicate;

import java.util.function.Predicate;

public class P1 
{
	public boolean testEqualString(String s)
	{
		if(s.length()==5)
		{
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) 
	{
		Predicate<String> str=s->s.length()==5;
		
		System.out.println(str.test("coddings"));
		
	}

}
