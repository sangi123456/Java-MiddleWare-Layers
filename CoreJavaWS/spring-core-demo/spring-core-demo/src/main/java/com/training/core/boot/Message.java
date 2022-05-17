package com.training.core.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="abc")
public class Message {
  
//	 @Value("${message.text}")
//	 private String text;
     
     
	 public Message() {
		 System.out.println("Message bean Instantiated...");
	
	 }
	
}
