package com.training.spring.core.customerdetails;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.spring.core.beans.Message;

public class Client {
	
public static void main( String[] args )
 {
   ApplicationContext container = new ClassPathXmlApplicationContext("spring-beans.xml");
     
    System.out.println("Container succesfully created...");
    Customer object = (Customer) container.getBean("customer");
        
    System.out.println(object.getCustomerId() + " " + object.getCustomerName() + " " 
        + object.getAddress().getCity() + " " + object.getAddress().getPincode() +" "
      + object.getOrder().getOrderId() + " " + object.getOrder().getOrderDate() 
      );
      
    }

}
