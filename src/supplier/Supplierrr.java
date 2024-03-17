package supplier;


import java.util.Date;
import java.util.function.Supplier;



public  class Supplierrr 
{
	public Date fetchDate()
	{
		return new Date();
		
		
	}

	public static void main(String[] args) {
		Supplierrr su=new Supplierrr();
		Supplier<Date> date=()-> new Date();
		System.out.println(((Supplierrr) date).fetchDate());
	}
	
}

