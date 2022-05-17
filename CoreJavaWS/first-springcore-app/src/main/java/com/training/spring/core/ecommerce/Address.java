package com.training.spring.core.ecommerce;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class Address{
private String city;




public Address(@Value("${customer.address.city}")String city)
{

System.out.println("Address constructor called....");
this.city = city;
}



public String getCity() {
return city;
}



public void setCity(String city) {
this.city = city;
}


}
