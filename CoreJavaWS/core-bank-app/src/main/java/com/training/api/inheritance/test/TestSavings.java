package com.training.api.inheritance.test;

import com.training.api.inheritance.Savings;

public class TestSavings {

	 public static void main(String[] args) {
		
	//child class object will inherit all properties 	 
	Savings savingObj1 = new Savings(1000L, "sangita", 35643, 2000);
	System.out.println(savingObj1.toString()); 
    System.out.println(savingObj1.getAccountId());
    System.out.println(savingObj1.getBalance());
    System.out.println(savingObj1.getHolderName());
    System.out.println(savingObj1.getMinBalance());
	
    
    //calling the static method of the saving class
      Savings.display();
    
    //calling count() of saving class
   // savingOj1.count();
		
   
	//withdraw method
    savingObj1.withdraw(3512);
    System.out.println("After withdraw - " + savingObj1.toString());
    
    //deposit method
    savingObj1.deposit(1000);
    System.out.println("After deposit - " + savingObj1.toString());
    
    }
	
}

