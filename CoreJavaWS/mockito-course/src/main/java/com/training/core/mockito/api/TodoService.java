package com.training.core.mockito.api;

import java.util.List;

//create Todoservice stub
//Test TodoBusinessimpl using TodoServiceStub

public interface TodoService {
	public List<String> retrieveTodos(String user);

public void deleteTodo(String todo);

      
	
	

}