package com.oopsAssignments;

public class SalaryBonous {
	public static void main(String[] args) {
		Manager m1=new Manager(111, "Aish", "Manager", 50000);
		Labour l1=new Labour(112, "Raju", "Supplier", 10000);
		System.out.println(m1.getEmpName()+"\t"+ m1.getSalary());
		System.out.println(l1.getEmpName()+"\t"+l1.getSalary());
	}

}