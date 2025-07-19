import java.util.*;

public class Employee{
	static int id;
	String name;
	String deptname;
	int salary;
	static int ObjCount = 0;
	
	Employee()
	{
		ObjCount++;
		id = 0;
		name = "Aditya";
		deptname = "CS";
		salary = 9999999;
	}
	
	Employee(int id, String name, String deptname, int salary)
	{
		ObjCount++;
		this.id = id;
		this.name = name;
		this.deptname = deptname;
		this.salary = salary;
	}
	
	public static void main(String[] args){
		int ObjCount = 0;
		Employee e1 = new Employee();
		
		System.out.printf("ID: %d Name: %s Department: %s Salary: %d\nObject count: %d\n", e1.id, e1.name, e1.deptname, e1.salary, Employee.ObjCount);
		
		Employee e2 = new Employee(1, "Sai", "Statistics", 9999);
		System.out.printf("ID: %d Name: %s Department: %s Salary: %d\nObject count: %d\n", e2.id, e2.name, e2.deptname, e2.salary, Employee.ObjCount);
		
		Employee e3 = new Employee(2, "Vrudrank", "Sales", 999);
		System.out.printf("ID: %d Name: %s Department: %s Salary: %d\nObject count: %d\n", e3.id, e3.name, e3.deptname, e3.salary, Employee.ObjCount);
	}
}
