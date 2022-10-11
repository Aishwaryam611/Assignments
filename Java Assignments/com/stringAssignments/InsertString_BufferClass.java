package com.stringAssignments;

public class InsertString_BufferClass {
	public static void main(String[] args) {
		
		String str1 = "It is used to at the specified index position"; //original string
		String str2 = "Insert text ";      // second string
		int index = 14;                    // Position where we are adding second string
		
		System.out.println("Initial String = " + str1);
		System.out.println("Index where new string will be inserted = " + index);
		
		StringBuffer newString = new StringBuffer(str1);   
		newString.insert(index, str2);         //using insert method 
		
		System.out.println("Resultant String = " + newString.toString());
	}
}
