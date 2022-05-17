package com.training.api.service;

import java.util.ArrayList;
import java.util.List;

import com.training.api.inheritance.Account;
import com.training.api.inheritance.Current;
import com.training.api.inheritance.Savings;

public class AccountOperations {
	
	
	//List<Account> list = 
   public static void printAccounts(List<Account> list){
	
	   for(Account account : list)
	   {
		     if(account instanceof Savings) 
		   {
			   System.out.println("Savings Account  Object - " + account.toString() );
		   }
		    else if(account instanceof Current) 
		    {
			   System.out.println("Current Account  Object - " + account.toString() );
		    }
	   }
	   
   }
   
   //add new account to the exisitng list
   public static void addNewAccount(List<Account> list) {
	 Account acc = new Savings(5000L, "pooja", 85000, 20000) ; 
	   list.add(acc);
   }
   
   //print account details whose balance > 20000
   public static List<Account> searchAccountBasedonBalance(List<Account> list, double amount ) {
	 
	   List<Account> tempList = new ArrayList<Account>();
	   
	   for (Account account: list) {
		   
	   if (account.getBalance() > amount)
	   {
	        tempList.add(account);
	   }
	   }
       //return new List object	
	   return tempList;
	   }	   
	
   //add 2000 to the accounts where balance less than the given amount
    public static void updateAccounts(List<Account> list, double amount) {
    	for(Account account : list)
    	{
    		  if(account !=null && account.getBalance() < amount) 
    		{
    		   account.deposit(2000);
    			// or -//account.setBalance(account.getBalance() + 2000);
    		}
    		  
         }
    	
    }
    
}

   

