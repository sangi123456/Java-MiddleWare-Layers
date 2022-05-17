package com.training.api.core.core_bank_app;

import com.training.api.core.Customer;

public class UpdateCustomer {

 public static void main(String args[]) 
	 {
		 
	Customer cust=new Customer(101,"Sangita","Nandgure","09/07/1998","female","mumbai");
  
    cust.updateCustomerName("Vaishu");
    
    cust.display();

	 }

	}


	
	
	
	

