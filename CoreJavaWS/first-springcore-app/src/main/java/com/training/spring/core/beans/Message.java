package com.training.spring.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.training.spring.core.dependbeans.User;

//@component will be processed to produce <bean>  </bean>
//<bean id = "name of the class starts with small letters"
//only one object of the bean will bve created in the spring conatiner at runtime
//only one object of bean will be created in th spring container
//new Message() => defsult vales are 0 and null 

@Component(value="abc")
@Scope("singleton")
@PropertySource("classpath:com/training/spring/core/beans/application.properties")

 public class Message {
	
	//the properties will be initialized after object creation
	
    @Value("${message.text}") //expression language
    private String text;

    @Value("${message.id}")
    private long messageId;

     private User user = null;

public String getText() {
	return text;
}

public void setText(String text) {
	this.text = text;
}

public long getMessageId() {
	return messageId;
}

public void setMessageId(long messageId) {
	this.messageId = messageId;
}

 public User getUser() {
	return user;
}

 
 //auto scan the dependencies and wire them in the obejct at runtime
 @Autowired
  public void setUser(User user) {
	System.out.println("Setter Method called for Wiring..");
	this.user = user;
}
 
//default constructor
  public Message() {
	System.out.println("Message object Constructed & Intialized..");
    System.out.println("text - " + this.text);	
    System.out.println("id - " + this.messageId);
   
  }
 }
