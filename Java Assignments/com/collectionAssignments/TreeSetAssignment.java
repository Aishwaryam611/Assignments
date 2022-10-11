package com.collectionAssignments;

import java.util.Comparator;
import java.util.TreeSet;

class Employee {
	int id;
	String name;
	String department;
	double salary;

	public Employee(int id, String name, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

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

public String getDepartment() {
	return department;
}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}

class ByNameSorting implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
	}
}

class SortingBySalary implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return (int) (e1.getSalary() - e2.getSalary());
	}
}

class SortingByDepartment implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		return e1.getDepartment().compareTo(e2.getDepartment());

	}
}

class SortingById implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		return e1.getId() - e2.getId();
	}
}

public class TreeSetAssignment {
	public static void main(String[] args) {
		TreeSet<Employee> emp = new TreeSet<>(new ByNameSorting());

		emp.add(new Employee(1, "ram", "IT", 40000));
		emp.add(new Employee(2, "sakshi", "HR", 23000));
		emp.add(new Employee(3, "siya", "HR", 26000));
		emp.add(new Employee(4, "Aish", "Account", 60000));

		// printing each employee object
		for (Employee employee : emp) {
			System.out.println(employee.name);
		}

	}
}