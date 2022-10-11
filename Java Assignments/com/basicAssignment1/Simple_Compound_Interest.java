package com.basicAssignment1;
import java.util.Scanner;
public class Simple_Compound_Interest 
{

	public static void main (String args[])
	{ 
		 Scanner input = new Scanner(System.in);

		 double simpleInterest;
		 double compoundInterest;
		 
		 // take input from users
		    System.out.print("Enter the principal amount: ");
		    double principalAmount = input.nextDouble();

		    System.out.print("Enter the rate: ");
		    double rate = input.nextDouble();
		   
		    System.out.print("Enter the time: ");
		    double time = input.nextDouble();
		    
		    System.out.print("Enter number of times interest is compounded: ");
		    int number = input.nextInt();

		    
		    simpleInterest = (principalAmount*rate*time)/100;
	
		    compoundInterest = principalAmount * (Math.pow((1 + rate/100), (time * number))) - principalAmount;
	   
	        System.out.println("Simple Interest is: " +simpleInterest);
	        System.out.println("Compound Interest is: " +compoundInterest);
	        input.close();

	          }
	         }



