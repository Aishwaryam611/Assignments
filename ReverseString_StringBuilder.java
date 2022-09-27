package com.stringAssignments;

public class ReverseString_StringBuilder {

	public static void main(String[] args) {

		// create a StringBuilder object
		// with a String pass as parameter
		StringBuilder str = new StringBuilder("This method returns the reverse object on which it was called");

		// print string
		System.out.println("String = " + str.toString());

		// reverse the string
		StringBuilder reverseStr = str.reverse();

		// print string
		System.out.println("Reverse String = " + reverseStr.toString());
	}
}
