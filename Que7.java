package com.lambdaAssignments;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Que7 {

	


		public static void main(String[] args) {
			
			Map<String , String>map=new HashMap<>();
			map.put("Sakshi", "Gosavi");
			map.put("Aish", "More");
			map.put("Lopa", "Chavan");
			map.put("Prakash", "Malani");
			map.put("Rutu", "Kale");
			
			
			String result=map.entrySet()
					.stream()
					.map((entry)->entry.getKey()+" "+entry.getValue())
					.collect(Collectors.joining(" , "));
			
			System.out.println(result);
			
		}

	}

	

