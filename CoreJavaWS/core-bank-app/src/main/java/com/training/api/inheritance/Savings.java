package com.training.api.inheritance;

public class Savings extends Account {

	private double minBalance;

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

	// child class constructor will invoke Parent class constructor
	public Savings(long accountId, String holderName, double balance, double minBalance) {
		super(accountId, holderName, balance); // super() method used to call parent class constructor
		System.out.println("paramterized constructor of Savings class called...");
		this.minBalance = minBalance;
	}

	// override other methods of parent class

	@Override
	public void withdraw(double amount) {
		// savings account
		if (amount <= 0) {
			System.err.println("Amount entered is not correct");
		} else if (getBalance() < amount) {
			System.err.println("Insufficient Balance");
		} else if ((getBalance() - amount) < this.minBalance) {
			System.err.println("After withdraw, balance goes below threshold limit");
		} else {
			setBalance(getBalance() - amount);
		}
	}

	@Override
	public void count() {
		super.count(); // invoking the count() implementation from the parent class - use super keyword
	};

	// public void show() {};

	// overriding static method will hide the Account class static method
	public static void display() {
		System.out.println("Display from Savings class");
	}

	// covariant return type
	public Savings myMethod(int val) {
		return null;
	};

}




