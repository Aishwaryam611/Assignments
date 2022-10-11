package com.basicAssignment1;

public class ArmstrongNumRange {

		public static void main(String[] args) 
			{
				
			    System.out.println("All the Armstrong number falling in the range of 100-999");
				int start = 100;
		        
				int end= 999;

				while(start<=end)
				{
					calculate(start);
				     start++ ;
				}
			}

		public static void calculate(int num)
				{
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
					System.out.println(sum);
				}

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
