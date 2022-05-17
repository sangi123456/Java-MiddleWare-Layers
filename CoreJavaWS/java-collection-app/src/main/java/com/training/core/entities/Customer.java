package com.training.core.entities;

import java.util.Arrays;

public class Customer {
	
    private long customerId;
    private String customerName;
    private String[] hobbies;
    
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	
	//constructor
	public Customer(long customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}
	
	//toString() method
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", hobbies="
				+ Arrays.toString(hobbies) + "]";
	}
	
	
	
	
}
