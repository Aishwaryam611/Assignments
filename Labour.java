package com.oopsAssignments;

	public class Labour extends Employee{
		public static int overTime=500;
		public Labour(int empId, String empName, String designation, double salary) {
			super(empId, empName, designation, salary);
			
		}
		public double getSalary() {
			return salary=salary+overTime;
		}

	}


