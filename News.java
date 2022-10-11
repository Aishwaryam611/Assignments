package com.streamAssignments;

import java.util.ArrayList;
import java.util.List;

class NewsInfo {

	int newsId;
	String postedByUser;
	String commentByUser;
	String comment;

	public NewsInfo(int newsId, String postedByUser, String commentByUser, String comment) {

		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
}

public class News {
	public static void main(String[] args) {
		List<NewsInfo> newsList = new ArrayList<NewsInfo>();
		// Adding NewsInfo
		newsList.add(new NewsInfo(101, "Aish", "Krishna", "Hello"));
		newsList.add(new NewsInfo(101,"Aish","Krishna","How are you"));  
		newsList.add(new NewsInfo(102, "Sara", "Budget", "Good"));
		newsList.add(new NewsInfo(103, "Pratik", "Gaurav", "Very Good"));
		newsList.add(new NewsInfo(104, "Nilesh", "Budget", "Excellent"));
		
		
		// max() method to get max Product price     
//        News news1 = newsList.stream().max((newsId > 
//        System.out.println(productA.price);    

	}
}