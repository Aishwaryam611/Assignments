package com.springCore.first;


public class Address {
	String street;
	String city;
	int Zip;
	String country;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZip() {
		return Zip;
	}
	public void setZip(int zip) {
		Zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void add()
	{
		System.out.println("street is : "+this.street +","+ "city is :"+ this.city+","+"Zip is :"+this.Zip+","+"country is :"+ this.country);
	}
	
	
	

}