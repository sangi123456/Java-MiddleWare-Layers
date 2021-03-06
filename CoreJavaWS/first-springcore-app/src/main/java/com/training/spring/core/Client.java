package com.training.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.spring.core.beans.Message;

/**
 * Hello world!
 *
 */
public class Client 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext container;
        container = new ClassPathXmlApplicationContext("spring-beans.xml");

        System.out.println("Container succesfully created...");
        
        //access the objects from the container
      Message object= (Message) container.getBean("abc");
     
    System.out.println("Message user name- " + object.getUser().getUsername());
    System.out.println("Message Id - " + object.getMessageId());
    System.out.println("Message text -" + object.getText());
   

   
    }
}

/*
//access the objects from the container
//getBean() returns object
Message object= (Message) container.getBean("abc");

//print object details
System.out.println(object.getText() + " " + object.getMessageId());

//set the new value
object.setMessageId(1000L);
object.setText("How are you?");

//print object details
System.out.println(object.getText() + " " + object.getMessageId());
*/