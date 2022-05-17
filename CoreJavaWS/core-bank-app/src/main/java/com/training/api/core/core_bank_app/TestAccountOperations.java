package com.training.api.core.core_bank_app;

import com.training.api.core.Account;

public class TestAccountOperations {
	
    public static void main(String[] args) {



Account acc1, acc2 = null; // two reference variable created on stack



acc1 = new Account(0, null, null); // Initialize the object

System.out.println(acc1.getAccountDetails());



acc1.accountId = 1000;
acc1.holderName = "john mathew";
acc1.accountType = "Savings";
acc1.balance = 5000;



// print object details
System.out.println(acc1.getAccountDetails());

// deposit amount in the account
acc1.deposit(400.78);



// print object details
System.out.println(acc1.getAccountDetails());

acc1.withdraw(-200);
// print object details
System.out.println("Balance after withdrae" + acc1.getBalance());

// Copy by value
acc2 = acc1;

// update the object state (properties)
acc2.accountId = 2000;
acc1.accountType = "Current";

System.out.println("acc2 - " + acc2.getAccountDetails());
System.out.println("acc1 - " + acc1.getAccountDetails());

// Account acc3,acc4 = acc1; // copy value from acc1 reference variable into acc3 & acc4 reference variable
// Delete the reference of a reference variable
acc2 = null;
System.out.println("After assign");

//a reference not printing to any object in memory
//raise NullPointerException
System.out.println("acc2 - " + acc2.getAccountDetails());
}
}