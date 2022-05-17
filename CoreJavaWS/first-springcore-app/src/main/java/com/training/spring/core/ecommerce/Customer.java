package com.training.spring.core.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;@Component

@PropertySource("classpath:com/training/spring/core/ecommerce/application.properties")
public class Customer
{
private long custId;
private String custName;
private Address address;
private Order order;
//constructor injection for address object
@Autowired
public Customer(@Value("${customer.id}")long custId, @Value("${customer.name}")String custName, Address address)
{
System.out.println("customer constructor called....");
this.custId = custId;
this.custName = custName;
this.address = address;
}public long getCustId() {
return custId;
}public void setCustId(long custId) {
this.custId = custId;
}public String getCustName() {
return custName;
}public void setCustName(String custName) {
this.custName = custName;
}public Address getAddress() {
return address;
}public void setAddress(Address address) {
this.address = address;
}public Order getOrder() {
return order;
}//setter injection for order object
@Autowired
public void setOrder(Order order) {
System.out.println("Order bean wired in customer..");
this.order = order;
}
}

