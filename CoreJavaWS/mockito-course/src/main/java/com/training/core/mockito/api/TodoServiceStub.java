package com.training.core.mockito.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService{
   //Dynamic conditions
	//service Definition
	
	public List<String> retrieveTodos(String user) {
	   return Arrays.asList("Learn Spring MVC","Learn Spring",
	                    "Learn to dance");
	
	}

public List<String> configureSomething(String user) {
	// TODO Auto-generated method stub
	return null;
}

public void deleteTodo(String todo) {
	// TODO Auto-generated method stub
	
}

}
