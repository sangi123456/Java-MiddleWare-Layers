package com.training.core.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

import com.training.core.entities.Customer;

public class CustomerArrayDemo {

	public static void printarray(Customer[] myarr) {
		
		//*ngFor = "let x of myarr"
	/*	for(int i = 0; i < myarr.length ; i++) {
			System.out.println(myarr[i].toString());
			
		}
	}
	*/ //Foreach loop to iterate myarr containing customer object
		
		for(Customer cust : myarr) {
			System.out.println(cust.getCustomerId() + ":" + cust.getCustomerName());
		  for(String hobby: cust.getHobbies()) {
			  System.out.println("Hobbies are - " + hobby.toUpperCase());
		  }
		}
		
		
	}  
	//find and return the customer searched by given ID in the customer array
	public static Customer findCustomer(Customer[] myarr, long custId) {
		// search
	    for(int i = 0; i < myarr.length; i++) 
	  {
		  if (myarr[i].getCustomerId() == custId) //to campare
		{
		    return myarr[i];
		}
		}
		return null;
		}
	
	
	public static void findCutomer(long custId) {
		
	}
	public static void main(String[] args) {
		
		Customer[] arr;
		arr = new Customer[3];
		
		Customer c1 = new Customer(100L, "sangita");
		c1.setHobbies(new String [] {"cricket", "football"});
		arr[0] = c1;
		
		Customer c2 = new Customer(200L, "sangita");
		c2.setHobbies(new String [] {"dancing", "singing"});
		arr[1] = c2;
		
		Customer c3 = new Customer(300L, "vaishu");
		c3.setHobbies(new String [] {"watching Movies", "palying chess"});
		arr[2]= c3;
		
		printarray(arr);
		
		System.out.println("Search a customer");
		System.out.println("*********************");
		Customer customer;
		customer = findCustomer(arr, 200L);
		System.out.println(customer.toString());
		findCustomer(arr, 400L);
		System.out.println(customer);
		
		
		System.out.println("Printing customer array after sorting based on name ");
		//sort of customers based on name property
		Arrays.sort(arr, new SortByCustomerName());
		printarray(arr);
		
		//sort customerArray based on CustomerId
		System.out.println("\n\n");
		System.out.println("Printing customer array after sorting based on Id");
		Arrays.sort(arr, new SortByCustomerId());
		printarray(arr);
		
	}
	
}
