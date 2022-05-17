package com.training.api.core.core_bank_app;

import com.training.api.core.Account;

import com.training.api.service.CreditCardService;

public class TestAccountCreditCard {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1000, "Sangita", "Savings", 3000);
		System.out.println(acc1.getAccountDetails());
		System.out.println("acc1 -" + acc1);
		
		
		CreditCardService service = new CreditCardService();
		boolean result = service.validateAccountType(acc1); //passing value of acc1 - 3
		
		//ternary (bookean variable or condition)? true : false;
		String x = result? "Eligible for credit card": "Not eligible for credit card";
        System.out.println("x");
    
    Account acc2 = new Account(2000, "Sakshi", "current", 3000);
   result = service.validateAccountType(acc2);
	//ternary (bookean variable or condition)? true : false;
	x = result ? "Eligible for credit card" : "Not eligiable for credit card";
	System.out.println(x);
	
	 result = service.validateAccountType(null);
		//ternary (bookean variable or condition)? true : false;
		x = result ? "Eligible for credit card" : "Not eligiable for credit card";
		System.out.println(x);
		
	
	}
	
}
