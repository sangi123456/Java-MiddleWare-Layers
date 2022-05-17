package com.training.core.mockito;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import com.training.core.mockito.api.TodoService;
import com.training.core.mockito.business.TodoBusinessImpl;

  public class TodoBusinessImplMockTest {
	
//what is mocking??
//mocking is creating objects that simulate the behaviour a real objects.
//unlike stubs mocks can be dynamically created from code - at runtime
//You can verify method calls and a lot of other things	
	
	
	  @Test
		public void usingMockito() {
			TodoService todoService = mock(TodoService.class);
			List<String> allTodos = Arrays.asList("Learn Spring MVC",
					"Learn Spring", "Learn to Dance");
			when(todoService.retrieveTodos("Dummy")).thenReturn(allTodos);
			TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
			List<String> todos = todoBusinessImpl
					.retrieveTodosRelatedToSpring("Dummy");
			assertEquals(2, todos.size());
		}

		@Test
		public void usingMockito_UsingBDD() {
			//given
			TodoService todoService = mock(TodoService.class);
			TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
			List<String> allTodos = Arrays.asList("Learn Spring MVC",
					"Learn Spring", "Learn to Dance");

		
			given(todoService.retrieveTodos("Dummy")).willReturn(allTodos);

			//when
			List<String> todos = todoBusinessImpl
					.retrieveTodosRelatedToSpring("Dummy");

			//then
			assertThat(todos.size(), is(2));
		}

		@Test
		public void letsTestDeleteNow() {
        //given
			TodoService todoServiceMock = mock(TodoService.class);

			List<String> allTodos = Arrays.asList("Learn Spring MVC",
					"Learn Spring", "Learn to Dance");

			when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(allTodos);

			TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
    
			  //when
			todoBusinessImpl.deleteTodosNotRelatedToSpring("Dummy");
         
			//Then
			verify(todoServiceMock).deleteTodo("Learn to Dance");

			verify(todoServiceMock, Mockito.never()).deleteTodo("Learn Spring MVC");

			verify(todoServiceMock, Mockito.never()).deleteTodo("Learn Spring");

			verify(todoServiceMock, Mockito.times(1)).deleteTodo("Learn to Dance");
			// atLeastOnce, atLeast

		}

		@Test
		public void captureArgument() {
			ArgumentCaptor<String> argumentCaptor = ArgumentCaptor
					.forClass(String.class);

			TodoService todoService = mock(TodoService.class);

			List<String> allTodos = Arrays.asList("Learn Spring MVC",
					"Learn Spring", "Learn to Dance");
			Mockito.when(todoService.retrieveTodos("Dummy")).thenReturn(allTodos);

			TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
			
			todoBusinessImpl.deleteTodosNotRelatedToSpring("Dummy");
			Mockito.verify(todoService).deleteTodo(argumentCaptor.capture());

			assertEquals("Learn to Dance", argumentCaptor.getValue());
		}
	}
	