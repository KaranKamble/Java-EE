package main;

class Person{
	
	String name;			//null //Field/data member		//parent / super class
	
	public void print() {
	//	int num = 10;		//Local variable
		System.out.println("Name : "+name);
	}
	
}
class Employee extends Person{								//child/ sub class
		int empId;
		
		public Employee() {
			System.out.println("Ctor");
			this.empId = 32;
		}
		
		public void print() {
			System.out.println(empId);
		}
}

public class Program {	

	
	public static void main(String[] args) {
	//	Employee emp = new Employee();
	//	emp.show();
		
		Person p1 = new Employee();		//up casting	// sub class can contain super class obj
		p1.print();
		
		Employee emp = (  Employee )p1; // down casting
		
	}

}
