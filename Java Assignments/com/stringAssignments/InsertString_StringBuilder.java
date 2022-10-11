package com.stringAssignments;

public class InsertString_StringBuilder {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("It is used to at the specified index position ");
		System.out.println("string1 :" + sb1);
  
		// Inserting string 
		sb1.insert(13, "Insert text");
		
		// print the StringBuilder after inserting
		System.out.println("after insert = " + sb1);

	}
}