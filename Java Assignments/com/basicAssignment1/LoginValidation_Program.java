package com.basicAssignment1;
import java.util.Scanner;
	
public class LoginValidation_Program 
	{
		public static void main(String[]args)
		{
			Scanner scanner = new Scanner(System.in);
			 int time = 0;
			 int user_id = 111;
			 String set_password = "Aish";
			 
			 do
			 {
				 
				 System.out.println("Enter user id");
				 int userId = scanner.nextInt();
				 
				 System.out.println("Enter the password");
				 String password = scanner.next();
				 
				 if(user_id==userId && set_password.equals(password))
				 {
					 System.out.println("Welcome");
					 break;
				 }
				 
				 else
				 {
					 System.out.println("Incorrect login credentials");
					 
				 }
				 
				 time++;
				 
			 }
			 while(time<3);
			 
			 if(time==3)
			 {
				 System.out.println("Contact admin"); 
			 }
			 scanner.close();

		}
	}

	

