package com.training.spring.core.ecommerce;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestEcommerce {

   public static void main(String[] args)
{
//step 1:intantiate container
ApplicationContext context;
context =new ClassPathXmlApplicationContext("spring-beans.xml");

System.out.println("customer created successfully ..");

//getbean(bean-name) or getBean(bean class)
Customer customer=context.getBean(Customer.class);

System.out.println(customer.getCustId()+" "+customer.getCustName()+" "+
customer.getAddress().getCity()+" "+customer.getOrder().getOrderDate());

}



}