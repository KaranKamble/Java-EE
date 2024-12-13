package main;

class Person{
	private String name;
	private int age;
	
	public Person() {
		this.name = "Satya";
		this.age = 24;
	}
	
	public void print() {
		System.out.println("Name  : "+this.name);
		System.out.println("Age   : "+this.age);
	}
	
}

class Employee extends Person{
	private int empId;
	private float salary;
	
	public Employee() {
		this.empId = 32;
		this.salary = 80000.0f;
	}
	
	public void print() {
		super.print();
		System.out.println("EmpId    : "+this.empId);
		System.out.println("Salary   : "+this.salary);
	}
}
public class Program {
	public static void main(String[] args) {
//		Person p = new Person();		//Normal Instance/Object
//		p.print();						//Normal call/msg passing
		
//		Employee emp = new Employee();	//Normal Instance/Object
//		emp.print();
		
		Person p1 = new Employee();		// upcasting
		p1.print();						//Run-time Polymorphism/dynamic method dispatch
		
		Employee emp = (Employee) p1;	//down casting
		emp.print();
	}

}
