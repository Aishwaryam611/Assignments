package com.springCore.first;


public class Customer {
	
	int customerId;
	String customerName;
	long customerContact;
	Address customerAddress;
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public void printDetails() {
		System.out.println("customerId :"+ this.customerId );
		System.out.println("customerName:" +this.customerName);
		System.out.println("customerContact :"+this.customerContact);
		System.out.println("customerAddress : ");
		System.out.println("street :"+getCustomerAddress().getStreet());
		System.out.println("City :" +getCustomerAddress().getCity());
		System.out.println("Zip : "+ getCustomerAddress().getZip());
		System.out.println("country :"+getCustomerAddress().getCountry());
	}
	

}