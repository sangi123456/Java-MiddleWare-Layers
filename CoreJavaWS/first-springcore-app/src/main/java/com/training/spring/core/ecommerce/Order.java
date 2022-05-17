package com.training.spring.core.ecommerce;

import java.time.LocalDate;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class Order
{
@Value("${(java.time.LocalDate).parse('${customer.order.purchase.date}')}")
private LocalDate orderDate;



public Order()
{
System.out.println("order constructor called...");
}
public LocalDate getOrderDate() {
return orderDate;
}


}

