package com.training.api.core.core_bank_app;

import com.training.api.core.Account;



public class TestAccountWithPublicAccessSpecifier {
	
	public static void main(String[] args) {

		// Object 1
		Account acc1 = null;
		
		// Object instantiation or creation and initialization
		acc1 = new Account(0, null, null);

		//operation or behaviour 
		
		
		
		//print account details
		System.out.println("\n\n Account 1 Details");
		System.out.println("ID - " + acc1.accountId);
		System.out.println("Name - " + acc1.holderName);
		System.out.println("Type - " + acc1.accountType);
		System.out.println("Balance - " + acc1.balance);

		//operation  or behavior update the balance based on last balance in the account
         //acc1.balance 
		// object 2
		Account acc2 = null;

		// Object instantiation or creation and initialization
		acc2 = new Account(0, null, null);

		//print account details
		System.out.println("\n\n Account 2 Details");
		System.out.println("ID - " + acc2.accountId);
		System.out.println("Name - " + acc2.holderName);
		System.out.println("Type - " + acc2.accountType);
		System.out.println("Balance - " + acc2.balance);
		}
		}
	
	
	
	
	

