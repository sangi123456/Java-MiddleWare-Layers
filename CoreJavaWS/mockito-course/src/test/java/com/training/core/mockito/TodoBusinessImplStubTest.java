package com.training.core.mockito;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.training.core.mockito.api.TodoService;
import com.training.core.mockito.api.TodoServiceStub;
import com.training.core.mockito.business.TodoBusinessImpl;

public class TodoBusinessImplStubTest {

	//stub is returning 3 values
	@Test
	public void testRetrieveTodosRelatedToSpring_usingAStub() {
		//given
		TodoService todoService = new TodoServiceStub();
		
		TodoBusinessImpl todoBusinessImpl = 
				new TodoBusinessImpl(todoService);
		
		List<String> filteredTodos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Dummy");
		
		assertEquals(2, filteredTodos.size());
	}
	
	
}