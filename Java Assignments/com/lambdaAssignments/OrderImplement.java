package com.lambdaAssignments;

import java.util.Scanner;

public class OrderImplement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Amount : ");
		Double a = scanner.nextDouble();

		Demo2 price = (double amt) -> {
			if (amt > 10000)
				return "ACCEPTED";
			else
				return "NOT ACCEPTED";
		};

		System.out.print(price.operation(a));
		scanner.close();

	}

}

interface Demo2 {
	String operation(double amt);
}
