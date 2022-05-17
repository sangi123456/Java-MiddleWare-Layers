package com.training.api.inheritance.test;

import com.training.api.inheritance.Savings;
import com.training.api.inheritance.Account;
import com.training.api.inheritance.Current;
import com.training.api.service.AccountTransactionService;

   public class TestTransactionAccount
{
   public static void main(String[] args) {
	//polymorphic behaviour of claases
	//shape (draw) --> overidden in triangle or circle
	
	Account account ;
	
 //runtime polymorphism based on child classes
   account = new Savings(1000L, "sangita", 4000, 2000);//account refererence pass with sving object
  System.out.println(
   "Interest amount on Savings - " +  AccountTransactionService.calculateInterest(account));
   
   //account.withdraw(2000);

account = new Current(2000L, "sakshi", 4000, 3000);
System.out.println(
  "Interest amount on Current - " +  AccountTransactionService.calculateInterest(account));

//account.withdraw(7000);
//System.out.println(account.toString());

//account = new String("hello");
//
//   account = new Account(); //stop creating account object 
//   //make a account class as Abstarct
//   System.out.println(
//   "Interest amount on non-visible account - " + 
//    AccountTransactionService.calculateInterest(account));
//we cannot create an object of abstarct class
}
}
