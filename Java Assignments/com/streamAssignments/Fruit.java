package com.streamAssignments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class FruitInfo {

	
	    int calories;
	    int price;
	    String color;
	    String name;  
	     
	    public FruitInfo(String name,int calories,int price ,String color) {  
	        
	        this.name = name; 
	        this.calories = calories;
	        this.price = price;
	        this.color = color;
	    }  
	}  
	public class Fruit  {  
	    public static void main(String[] args) {  
	        List<FruitInfo> fruitList = new ArrayList<FruitInfo>();  
	        //Adding FruitInfo  
	        fruitList.add(new FruitInfo("Mango",90,150,"Yellow"));  
	        fruitList.add(new FruitInfo("Oranges",120,170,"Orange"));  
	        fruitList.add(new FruitInfo("Apple",150,250,"Red"));  
	        
	        System.out.println("1----------------");
	        List<String>FruitList2 =fruitList.stream()  
	                                     .filter(p -> p.calories<100)// filtering data  
	                                     .map(p->p.name)        // fetching name  
	                                     .collect(Collectors.toList()); // collecting as list  
	        System.out.println(FruitList2); 
	        System.out.println("2-------------------");
	        
	      //color wise List
	       fruitList.stream()  
            .forEach(fruit -> System.out.println(fruit.color));  
	       
	       System.out.println("3-------------------");
	       
	       
	       fruitList.stream()  
           .filter(fruit -> fruit.color =="Red")  
           .forEach(fruit -> System.out.println(fruit.price));    
	    }  
	}  
	
	

