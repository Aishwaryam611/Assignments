package com.stringAssignments;

public class String_Methods {
	

	public static void main(String args[]) {

 String str1 = "Java string pool refers to collection of a string in which are stored in heap memory";
		
//print distinct to console in a lower case

 String strlower=str1.toLowerCase();  
 
 System.out.println("1...Converting string into lower case: " + strlower);  
 
 
//print distinct to console in a upper case

String strupper=str1.toUpperCase();  

System.out.println("2...Converting string into upper case: " + strupper);  

 //replace all the 'a' characters in the string with $ sign
String strreplace=str1.replace('a','$');  

System.out.println("3...Replacing all the 'a' characters in the string with $ sign : " + strreplace);


//check if the original string contains the word "collection"

boolean result = str1.contains("Collection");
System.out.println("4... String contains word collection: "+ result); 

//check if the following string Java string pool refers to collection of a string which are stored in heap memory matches the original
String str2 = "Java string pool refers to collection of a string which are stored in heap memory";
boolean result1 = str1.equals(str2);

System.out.println("5... check string matches to each other: " + result1);

	}
}