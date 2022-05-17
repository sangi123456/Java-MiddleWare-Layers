package com.training.core.boot.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component(value="servicebean")

//@Service(value="serviceBean")
public class MessageService {

	public MessageService() {
		System.out.println("MessageService Bean instantiated..");
	}
}

//MessageService serviceBean = new Message