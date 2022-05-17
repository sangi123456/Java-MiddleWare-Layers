package com.training.api.inheritance;

public abstract class Account extends Object {
	private long accountId;
	private String holderName;
	private double balance;
	
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public long getAccountId() {
		return accountId;
	}
	
	public Account(long accountId, String holderName, double balance) {
		System.out.println("Paramterized constructor of Account called...");
		this.accountId = accountId;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	public Account() {
		System.out.println("Account Class Default Constrcutor called...");
	}
	
	@Override // JDK 1.5 - @ representation of Annotations
	public String toString() {
		return "[" + this.accountId + ":" + this.holderName + ":" + this.balance + "]";
	}
	
	// business methods - code reusability 
	public abstract void withdraw(double amount);

	public final void deposit(double amount) {
		this.balance += amount;
	}
	
	
	protected void count() {
		System.out.println("count called from account");
	}
}