package com.lambdaAssignments;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Laptop");
		list.add("Computer");
		list.add("Keys");
		list.add("HeadPhone");
		list.add("Mobile");
		System.out.println("Contents of the list: " + list);
		list.replaceAll(new ReplaceToUpperCase());
		System.out.println("Contents of the list after replace operation: \n" + list);

	}

}
