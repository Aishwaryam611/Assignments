package com.stringAssignments;

public class AppendString_StringBuffer {

	 public static void main(String[] args) {  
		 
		 
         StringBuffer sb1 = new StringBuffer("StringBuffer");  
         System.out.println("buffer value: "+sb1); 
         
      // appending boolean argument  
         sb1.append("is a peer class of a string");  
         // print the StringBuffer after appending  
         System.out.println("after append: " + sb1);  
 
         sb1.append("that provides much of ");  
         System.out.println("after append: " + sb1);
           
         // appending boolean argument      
         sb1.append("the functionality of a string"); 
         System.out.println("after append: " + sb1);  
	
}

}