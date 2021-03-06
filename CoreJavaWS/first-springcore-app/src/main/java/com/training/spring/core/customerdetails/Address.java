package com.training.spring.core.customerdetails;

import org.springframework.stereotype.Component;

@Component
public class Address {
  
	 private String city;
	 private int pincode;
	 
	 //getter & setter
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	//default constructor
	 public Address() 
	 {
		 System.out.println("Address Object Initialized");
	     this.city = "Pune";
	     this.pincode = 411028;
	 }
	
}
