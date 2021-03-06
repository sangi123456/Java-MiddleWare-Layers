package com.training.spring.core.dependbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com/training/spring/core/beans/application.properties")
public class User {

	  @Value("${user.username}")
	private String username;

	//getter & setter
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	//default constructor
	public User(String username) {
	    this.username = username;
	}
	
	 public User() 
	{
		System.out.println("User Bean instantiated in the container..");
	     this.username = "sangita";
	}
}
