package com.lambdaAssignments;
import java.util.ArrayList;
import java.util.List;


public class OddLength {



	public static void main(String[] args) {
		
		List<String>list=new ArrayList<>();
		list.add("Aish");
		list.add("Sonal");
		list.add("Sakshi");
		list.add("Sonu");
		list.add("radhika");
		list.add("Tara");
		
		
		list.removeIf(word->word.length()==4);
		list.forEach(System.out::println);
		
	}

}







