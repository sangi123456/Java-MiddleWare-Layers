package com.training.spring.core.customerdetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com/training/spring/core/ecommerce/application.properties")
public class Customer {
	
private long customerId;
private String customerName;
private Address address;
private Order order;

//getter & setter
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

public Address getAddress() {
	return address;
}

@Autowired
public void setAddress(Address address) {
	this.address = address;
}
public Order getOrder() {
	return order;
}

@Autowired
public void setOrder(Order order) {
	this.order = order;
}

 public Customer() {
	System.out.println("Customer Object Initialized...");
	this.customerId = 5000L;
	this.customerName = "sakshi";
}
	}
