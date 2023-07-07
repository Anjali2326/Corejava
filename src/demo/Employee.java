package demo;

public class Employee {
	int id;
	String name;
	String companyName;
	String place;
	
	
	
	public Employee(int id, String name, String companyName, String place) {
		super();
		this.id = id;
		this.name = name;
		this.companyName = companyName;
		this.place = place;
	}
	
	  void display()
	{
		System.out.println(id+" "+name+" "+companyName+" "+place);
	}
	
	
	public static void main(String[] args) {
		
		Employee e= new Employee(100, "anjali", "oracle", "Uk");
		Employee e1= new Employee(101, "anjali", "oracle", "Uk");
		Employee e2= new Employee(102, "anjali", "oracle", "Uk");
		Employee e3= new Employee(103, "anjali", "oracle", "Uk");
		
		e.display();
		e1.display();
		e2.display();
		e3.display();

	}
	
}
