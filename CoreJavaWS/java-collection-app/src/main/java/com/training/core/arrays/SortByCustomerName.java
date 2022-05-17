package com.training.core.arrays;

import java.util.Comparator;

import com.training.core.entities.Customer;

//T-type-user,

public class SortByCustomerName implements Comparator<Customer>{ 
	
	public int compare(Customer c1, Customer c2) 
	{
		String name1 = c1.getCustomerName();
		String name2 = c2.getCustomerName();
		
		return name1.compareTo(name2);
    }
	
	
}

