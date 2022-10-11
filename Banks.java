package com.oopsAssignments;

import java.util.Scanner;

class SavingsAccount extends Banks {

	public int totalAmount(int fixedDep, int interest, int time) {
		double gross = fixedDep + ((fixedDep / 100) * interest) * Math.floor(time / 6);
		Double d = new Double(gross);
		int gross_int = d.intValue();
		return gross_int;
	}
}

class CurrentAccount extends Banks {

	public int totalAmount(int cashcredit, int interest_credit, int time_credit) {
		double credit = cashcredit + ((cashcredit / 100) * interest_credit) * Math.floor(time_credit / 12);
		Double d_credit = new Double(credit);
		int credit_int = d_credit.intValue();
		return credit_int;
	}

}

public class Banks {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int credit, fixedDep, interest, time, interest_credit, time_credit;

		System.out.println("Enter Fixed Deposit Amount: ");
		fixedDep = scan.nextInt();

		System.out.println("Enter the interest rate in Fixed Deposit: ");
		interest = scan.nextInt();

		System.out.println("Enter the time period in months: ");
		time = scan.nextInt();

		SavingsAccount save = new SavingsAccount();
		System.out.println("Amount in Savings Account is: " + save.totalAmount(fixedDep, interest, time));

		System.out.println("Enter Cash Credit Amount: ");
		credit = scan.nextInt();

		System.out.println("Enter the interest rate in Cash Credit ");
		interest_credit = scan.nextInt();

		System.out.println("Enter the time period in months: ");
		time_credit = scan.nextInt();

		CurrentAccount current = new CurrentAccount();
		System.out
				.println(" Amount in Current Account is: " + current.totalAmount(credit, interest_credit, time_credit));

		System.out.println("Total Amount in Bank is: " + (save.totalAmount(fixedDep, interest, time)
				+ current.totalAmount(credit, interest_credit, time_credit)));
	}

}