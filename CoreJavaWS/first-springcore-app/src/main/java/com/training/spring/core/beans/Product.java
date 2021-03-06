package com.training.spring.core.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//register to instaantiate bean in the sring conatiner
//initialize 2 properties productId & productName should be initialized in the constrcutor
//initialize other through setter 

@Component(value = "productBean")
@PropertySource("classpath:com/training/spring/core/beans/application.properties")
public class Product {
	
   private long prouctId;
   private String productName;
   
   //generate setter method and call them from initializing
  // @Value("${product.unit.price}") //it will invoke the setter method to initialize the priperties
   private double price;
   /*
    * @Value("${product.unit.price}")
    * public void setPrice(double price){
    * this.price= price;
    * }
    */
   
     @Value("${category.name}") //it will invoke the setter method to initialize the [property
    private String category;
   /*
    * @Value("${category.name}")
    * public void setCategory(String Category){
    * this.Category= category;
    * }
    */
    
    //constructor
    public Product(@Value("${product.code}")long prouctId, @Value("${product.name}") String productName) {
      System.out.println("product beans instantiated..");
       this.prouctId = prouctId;
	   this.productName = productName;
	}
    
    //getter & setter
	public long getProuctId() {
		return prouctId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getCategory() {
		return category;
	}

	@Value("${product.unit.price}")
	public void setPrice(double price) {
		System.out.println("Prouct price - setter method");
		this.price = price;
	}

	public void setCategory(String category) {
		System.out.println("category - setter method");
		this.category = category;
	}
	
}
