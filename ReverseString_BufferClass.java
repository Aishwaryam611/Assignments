package com.stringAssignments;

public class ReverseString_BufferClass {

	 public static void main(String args[])
	    {
	        StringBuffer sbf = new StringBuffer("This method returns the reverse object on which it was called");
	        System.out.println("String buffer = " + sbf);
	         
	       
	        sbf.reverse();  // Here it reverses the string 
	        System.out.println("String buffer after reversing = " + sbf);
	    }
	}
	

