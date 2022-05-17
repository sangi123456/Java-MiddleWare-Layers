package com.training.api.service;

import com.training.api.core.Account;

public class CreditCardService {
 
   
	/*
	 *business code
	 
	// if(acc1.getAccountType().equals("Savings")) {
	//	 syste.out.println("you are eligible for credit card");
	// }
	 
	 */
	
	
	
	
	//based on acc type
	//add a method to return eligibility for the credit card
	
	//design a method that takes Account object & return a boolean value
	
	public boolean validateAccountType(Account account) {
	
		System.out.println("Account - " + account);
	
		   if(account != null) 
		{
		   return account.getAccountType().equalsIgnoreCase("Savings");
	     }
	     return false;
		
		
	}
	
}	
	

