package com.training.api.inheritance;

public class Current extends Account {

	private double overdraft;

	// child class constructor will invoke Parent class constructor
	public Current(long accountId, String holderName, double balance, double overdraft) {
		super(accountId, holderName, balance); // super() method used to call parent class constructor
		System.out.println("paramterized constructor of Current Account class called...");
		this.overdraft = overdraft;
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		// super.withdraw(amount);

		System.out.println("Current Withdraw method is called...");
	}

}
