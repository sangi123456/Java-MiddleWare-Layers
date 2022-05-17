package com.training.api.core.core_bank_app;

import com.training.api.core.Account;

public class UpdateAccount {

		public static void main(String[] args) {
			
        Account acc1 = null; // reference variable
        
        //object creation + initialization
        acc1 = new Account(79205, "Suvarna Nandgure","Saving", 5000); //object creation + initialization with default vales
      
        
        //updating holder name
        
        acc1.setHolderName("Kitty Nandgure");
        System.out.println("After account Details are updated " + acc1.getAccountDetails());
        
        String str = "Suvarna";
        
        //decision making on the property state
       
        if(acc1.getHolderName().equals(str)) {
        	System.out.println("Both objects are equal on data");
        }else {
        	System.out.println("Both objects are not equal on data");
        }
        
        Account peter = new Account(284562, "peter", "current");
       
        Account pitter = new Account(34567,"Surekha","current");
        pitter.setBalance(2000);
        System.out.println(pitter.getAccountDetails());
        pitter.withdraw(4500);
        System.out.println(pitter.getAccountDetails());


        System.out.println(peter.getAccountDetails());
        peter.withdraw(4500);
		}
}


