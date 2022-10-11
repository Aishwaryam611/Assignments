package com.lambdaAssignments;

interface Demo{
	public int operation(int num1,int num2);
}



public class ArithmaticOperations {

	public static void main(String[]args)
	{
		Demo add = (a,b)->
		{
			return a+b;
		};
		
		Demo sub = (a,b)->
		{
			return a-b;
		};
	
		Demo mul = (a,b)->
		{
			return a*b;
		};
		
		Demo div = (a,b)->
		{
			return a/b;
		};
		
		System.out.println("Addition of two number 10 & 20 is: " +add.operation(10,20));
		System.out.println("substraction of two number 20 & 10 is: " +sub.operation(20,10));
		System.out.println("multiplication of two number 10 & 20 is: " +mul.operation(10,20));
		System.out.println("Division of two number 100 & 20 is: " +div.operation(100,20));
	}
	
}
