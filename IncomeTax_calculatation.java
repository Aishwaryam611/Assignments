package com.basicAssignment1;

import java.util.Scanner;
public class IncomeTax_calculatation {


		public static void main (String args[])
		{ 
			 Scanner input = new Scanner(System.in);

			double tax ;
			 // take input from users
			    System.out.print("Enter the Annual income: ");
			    double income = input.nextDouble();

			    if(income==0 || income<=180000)
			    {
			    	System.out.println("No need to pay tax");
			    }
			    
			    else if(income>=181001 &&income<=300000)
			    {
			    	tax= 0.01*income;
			    	
			    	System.out.println("Tax amount is:"+ tax);
			    }
			    else if(income>=300001 &&income<=500000)
			    {
			    	tax=0.02*income ;
			    	
			    	System.out.println("Tax amount is:"+ tax);
			    }
			    else if(income>=500001 &&income<=1000000)
			    {
			    	tax=0.03*income ;
			    	
			    	System.out.println("Tax amount is:"+ tax);
			    }
			    input.close();

			    
		}
}