package com.training.api.service;

import com.training.api.inheritance.Account;
import com.training.api.inheritance.Current;
import com.training.api.inheritance.Savings;

public class AccountTransactionService {

	  public static  double calculateInterest(Account account)
	{
		double interestAmount = 0.0;
		
		 //saving account intrest will be 1% period of 1 year
		    if(account instanceof Savings) 
		  {
			  System.out.println("Savings");
			  interestAmount = account.getBalance() * 0.1* 1;
		  }
		  
		  //current account intreest will be 1.5% of 1 year 
           if(account instanceof Current) 
         {
        	 System.out.println("Current");
        	 interestAmount = account.getBalance() * 0.15 * 1;
         }
		  return interestAmount;
	}
	
}
