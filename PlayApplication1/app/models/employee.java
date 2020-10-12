package models;

import java.util.HashSet;
import java.util.Set;

public class employee{

	public int id;
	public String name;
	public int salary;

	public employee(int id , String name, int salary) {
		this.id=id;
		this.name = name;
		this.salary = salary;
	}
	
	private static Set<employee> Employee;
	
	static {
		Employee = new HashSet<>();
		Employee.add(new employee(1,"Nikhil",18000));
		Employee.add(new employee(2,"Amit",18000));
		Employee.add(new employee(3,"Chetan",18000));
		Employee.add(new employee(4,"Srikanth",18000));
	}
	public static Set<employee> allEmployees(){
		return Employee;
	}
}
