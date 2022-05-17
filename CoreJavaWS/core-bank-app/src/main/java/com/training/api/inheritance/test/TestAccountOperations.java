package com.training.api.inheritance.test;

import java.util.ArrayList;
import java.util.List;

import com.training.api.inheritance.Account;
import com.training.api.inheritance.Current;
import com.training.api.inheritance.Savings;
import com.training.api.service.AccountOperations;

public class TestAccountOperations {

	public static void main(String[] args) {
		
	List<Account> list = new ArrayList<Account>();
		
     list.add(new Current(2000L, "peter",45000,3000));
		 
	  list.add(new Savings(2000L, "john",78000,20000));
	      
	  list.add(new Savings(2000L, "aman",85000,10000));
	
	   //invoke printAccounts method
	 // AccountOperations.printAccounts(list);
	  
	//  AccountOperations.addNewAccount(list);
	  
	//  System.out.println("After adding new account object");
	  
	 // AccountOperations.printAccounts(list);
	  
	//  System.out.println("Account whose balance > 47000 ");
	 // List<Account> resultList =   AccountOperations.searchAccountBasedonBalance(list, 47000);
	 // AccountOperations.printAccounts(resultList);
	
	  //printing updated Accounts
	   System.out.println("After updating balance with 2000");
	   AccountOperations.updateAccounts(list, 45000);
	   AccountOperations.printAccounts(list);
	   
	}
}
