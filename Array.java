package com.basicAssignment1;

import java.util.Scanner;

public class Array {

	public static void main(String[]args)
	{
		int a[]= {1,32,45,37,56,12,39,99,19,87,29,16,11,65,22};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value to be searched");
		
		int input = scanner.nextInt();
		int i;
	
		for(i=0;i<a.length;i++)
		{
			if(input==a[i])
			{
			System.out.println("Element found at "+i+ " possition");
			break;
		    }
		}
		
			
			{
				System.out.println("Element not found");
			}
		
			scanner.close();	
	}
	
}