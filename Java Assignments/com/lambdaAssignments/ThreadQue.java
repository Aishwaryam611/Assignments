package com.lambdaAssignments;

	import java.util.ArrayList;
	import java.util.List;
	
	public class ThreadQue {

		public static void main(String[] args) {
			
			List<Integer>list=new ArrayList<>();
			
			list.add(11);
			list.add(12);
			list.add(13);
			list.add(14);
			list.add(15);
			list.add(16);
			list.add(17);
			
			Thread newThread=new Thread(()->System.out.println(list));
			
			newThread.run();
			
		}

	}

	
	
	

