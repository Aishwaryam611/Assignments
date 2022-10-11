package com.ExceptionalHandlingAssignment;
import java.util.Scanner;
public class ArithmaticException {
	public static void main(String[]args)
	{
		
		        try {
		            int num1,num2;
		            Scanner scanner =  new Scanner(System.in);
		            System.out.println("Enter the first number ");
		            num1 = scanner.nextInt();
		            System.out.println("Enter the second number ");
		            num2 = scanner.nextInt();
		            System.out.println(num1/num2);
		        }
		        catch(Exception e)
		        {
		            System.out.println(e);
		        }
		        
		    }



		}