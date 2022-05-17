package com.training.core.arrays;

import java.util.Comparator;

import com.training.core.entities.Customer;

public class SortByCustomerId implements Comparator<Customer> {
 //300, 200 = 300-2=100 (positive)means second value is less and that will be first number in sort
	
	  public int compare(Customer c1, Customer c2) 
	{
		long d1 = c1.getCustomerId();
		long d2 = c2.getCustomerId();
		return (int) (d1- d2); //explict typpe casting
	}
	
}
