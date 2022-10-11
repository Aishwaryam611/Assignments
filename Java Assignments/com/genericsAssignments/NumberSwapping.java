package com.genericsAssignments;

import java.util.ArrayList;
import java.util.Collections;

public class NumberSwapping {
	 public static void main(String args[])
	    {
	 
	        // Create the Array List
	        ArrayList<String> arrList = new ArrayList<String>();
	 
	        // add the values in Array List
	        arrList.add("Item 1");
	        arrList.add("Item 2");
	        arrList.add("Item 3");
	        arrList.add("Item 4");
	        arrList.add("Item 5");
	 
	        // display Array List before swap
	        System.out.println("Before Swap the ArrayList ");
	        System.out.println(arrList);
	 
	        // Swapping the elements at 1 and 2 indices
	        Collections.swap(arrList, 1, 2);
	 
	        // display Array List after swap
	        System.out.println("After Swap the ArrayList");
	        System.out.println(arrList);
	    }
	}

