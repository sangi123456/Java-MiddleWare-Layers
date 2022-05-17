package com.training.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.spring.core.beans.Product;

  public class TestProduct {
	  
     public static void main(String[] args) {
    	 
        // step 1 instantiate container
          ApplicationContext context;
          
           context = new ClassPathXmlApplicationContext("spring-beans.xml");
           
         System.out.println("conatiner created successfully");
         Product product = (Product) context.getBean("productBean");
         
        System.out.println(product.getProuctId() + " " + product.getProductName() + " " + product.getPrice() + " " + product.getCategory());
}
}

