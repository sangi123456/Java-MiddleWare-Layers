package com.training.core.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void letsMockListSizeMethod1() {
	//Givcen-setup
		
		List listMock = mock(List.class);
	    when(listMock.size()).thenReturn(2);
	//when - actual method call
	
	//Then -asserts
	assertEquals(2,listMock.size());
	assertEquals(2,listMock.size());
	assertEquals(2,listMock.size());
	}

	@Test
	public void letsMockListSize_ReturnMultipleValues() {
	List listMock = mock(List.class);
	when(listMock.size()).thenReturn(2).thenReturn(3);
	
	assertEquals(2,listMock.size());
	assertEquals(3,listMock.size());
	
	}
	
	@Test
	public void letsMockListGet() {
	List listMock = mock(List.class);
	
	//Argument Matcher
	when(listMock.get(anyInt())).thenReturn("Welcome Learning in  Mockito");
	
	assertEquals("Welcome Learning in Mockito",listMock.get(0));
	assertEquals("Welcome Learning in Mockito",listMock.get(1));
	
	}

	@Test(expected=RuntimeException.class)
	public void letsMockList_throwAnException() {
	List listMock = mock(List.class);
	
	//Argument Matcher
	when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something"));
	
	listMock.get(0);
	
	
	}
	
	}

	

