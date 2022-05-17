package com.training.api.core;

public class Customer 
{

	public long CustomerId;
	public String firstName;
	public String lastName;
	public String DOB;
	public String gender;
	public String address; public Customer(long CustomerId,String firstName,String lastName,String DOB,String gender,String address) {
	this.CustomerId=CustomerId;
	this.firstName=firstName;
	this.lastName=lastName;
	this.DOB=DOB;
	this.gender=gender;
	this.address=address;
} 
	
	public void updateCustomerName(String firstName ) 
{
	    this.firstName=firstName;
} 

	public void display()
	
 {
	System.out.println("Customer Information");
	System.out.println("Customer Id:"+CustomerId);
	System.out.println("Customer name:"+firstName+" "+lastName);
	System.out.println("Date of Birth:"+DOB);
	System.out.println("Gender:"+gender);
	System.out.println("Address:"+address);
	System.out.println("***************");
	
}
	}


     