package com.ExceptionalHandlingAssignment;

import java.util.Scanner;

class InsufficientBalanceException extends RuntimeException {

}

public class SavingAccount {
	Scanner scanner = new Scanner(System.in);

	public void withdrawal(double a) {
		System.out.println("Enter your Id ");
		long id = scanner.nextLong();
		System.out.println("Enter your balance ");
		double b = scanner.nextDouble();
		try {
			if (a <= b) {
				b = b - a;
				System.out.println("Balance= " + b);

			} else {
				throw new InsufficientBalanceException();
			}

		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
			// System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount s = new SavingAccount();
		s.withdrawal(2000);
	}

}
