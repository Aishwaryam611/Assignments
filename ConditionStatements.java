package com.basicAssignment1;

import java.util.Scanner;

public class ConditionStatements {
	
	public static void main(String[] args) 
		{
			Scanner scanner = new Scanner(System.in);
				System.out.println("Enter your marks in English");
				 int engMarks = scanner.nextInt();
	            System.out.println("Enter your marks in Maths");
	            int mathsMarks = scanner.nextInt();
	            System.out.println("Enter your marks in Hindi");
	            int hindiMarks = scanner.nextInt();
				
	         
		
	if (engMarks>60 && mathsMarks>60 && hindiMarks>60)
	{
		System.out.println("Passed..");
	}

			else if (engMarks>60 && mathsMarks>60 && hindiMarks<60 ||
                     engMarks<60 && mathsMarks>60 && hindiMarks>60 ||
                     engMarks>60 && mathsMarks<60 && hindiMarks>60 )
			{
				System.out.println("Promoted..");
			}
	
			else if(engMarks>60 || mathsMarks>60 || hindiMarks>60 ||
                    engMarks<60 && mathsMarks<60 && hindiMarks<60)
			{
				System.out.println("Failed...");
			}
	scanner.close();

			
}
}