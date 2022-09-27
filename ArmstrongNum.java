package com.basicAssignment1;
import java.util.Scanner;

public class ArmstrongNum
{
	public static void main(String[] args) 
		{
			Scanner scanner = new Scanner(System.in);
		    System.out.println("Enter a number");
			int num = scanner.nextInt();
	      int temp = num;
				int count = 0;

				
				while(temp>0)
				{
					temp/=10;
					count++;
				}
			int sum=0;
			for(int i=num;i>0;i/=10)
			{
				int rem=i%10;
				sum=sum+power(rem,count);
			}
			if (sum==num)
			{
				System.out.println("Number is armstrong number");
			}
			else
			{
				System.out.println("Number is not armstrong number");
	         }
			scanner.close();

		}
	public static int power(int base,int exp)
		{
			int pow=1;
			while(exp>0)
			{
				pow = pow * base;
				exp--;
			}
			return pow;
		}
	}
	
