package com.springCore.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Customer customer = (Customer) context.getBean("Customer");
		customer.printDetails();
		Address address = (Address) context.getBean("Address");
		address.add();
	}

}