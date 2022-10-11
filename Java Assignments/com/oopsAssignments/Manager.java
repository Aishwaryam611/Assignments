package com.oopsAssignments;

	public class Manager extends Employee {
		public static double incentive=0.5;
		public Manager(int empId, String empName, String designation, double salary) {
			super(empId, empName, designation, salary);
			
		}
	public double getSalary() {
		return salary=salary * incentive;
	}
	}


