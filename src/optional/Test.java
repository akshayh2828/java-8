package optional;

import java.util.Optional;

import javax.naming.NameNotFoundException;

public class Test {
	public static void main(String[] args) throws NameNotFoundException {
		Customer c=new Customer(1,null, "akshay@12", 500000);
		System.out.println(c);
		Optional<Object> op=Optional.empty();
		System.out.println(op);
		/*
		  Optional<String> name=Optional.of(c.getName()); System.out.println(name);
		 */
		Optional<String> name=Optional.ofNullable(c.getName());
		//System.out.println(name.orElse("akshay@123"));
		/*
		 if(name.isPresent()) { System.out.println(name);
		   } */
		System.out.println(name.orElseThrow(()->new NameNotFoundException("name is not present")));
	}

}
