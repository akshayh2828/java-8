package terminal;

import java.util.Arrays;
import java.util.List;

public class Employee 
{
	private int id;
	
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	public static void main(String[] args) {
		Employee emp=new Employee(1, "akshay");
		Employee emp1=new Employee(2, "santosh");
		Employee emp2=new Employee(3, "nikhil");
		Employee emp3=new Employee(4, "akhilesh");
		
		List<Employee>empList=Arrays.asList(emp,emp1,emp2,emp3);
		List<Integer> inlist=Arrays.asList(1,2,3,4); 
	

	System.out.println(inlist.stream().reduce((a,b)->a+b).get());
	
	inlist.stream().filter(a->a%2==0).map(a->a+a).filter(a->a>5). forEach(a->System.out.println(a));

//	inlist.stream().filter(a->a%2==0).map(a->a+a).filter(a->a>5).count();
	
	//	empList.stream().filter(e->e.getId()%2==0).map(e->e.getName()).forEach(e->System.out.println(e));
	}

}
