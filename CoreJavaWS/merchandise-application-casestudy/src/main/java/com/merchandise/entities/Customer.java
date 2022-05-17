package com.merchandise.entities;

import java.util.ArrayList;
import java.util.Arrays;

public class Customer extends Merchandise {
	
	// customers array contains the list of all customers created by the user
	private static Customer[] customers;
	private float creditLimit;
	private String phoneNumber;
	private String email;

	static {
		customers = new Customer[5];
	}
	
	//constructor
	public Customer(int partnerId, String partnerName, String city, String state, float creditLimit, String phoneNumber,
			String email) {
		super(partnerId, partnerName, city, state);
		this.creditLimit = creditLimit;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public float getCreditLimit() {
		return this.creditLimit;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public String getEmail() {
		return this.email;
	}

	public static Customer[] getCustomers() {
		return Customer.customers;
	}

	public static void setCustomers(Customer[] customers) {
		Customer.customers = customers;
	}

	// toString() method
	@Override
	public String toString() {
		String printString;
		printString = super.toString();
		printString += "\nPhone number: " + this.phoneNumber;
		printString += "\nEmail: " + this.email;
		printString += "\nCredit limit: " + this.creditLimit;
		return printString;
	}

	// validate() method
	@Override
	public String[] validate() {
		String[] errorMessages = new String[8];
		errorMessages = super.validate();
		ArrayList<String> errorMessagesList;
		errorMessagesList = new ArrayList<String>(Arrays.asList(errorMessages));
		String errorMessage = "";

		if (this.creditLimit > 50_000) {
			errorMessage = "Credit limit cannot be greater than 50,000";
			errorMessagesList.add(errorMessage);
		}
		
		if (this.phoneNumber != null && this.phoneNumber.length() > 0) {
			if (this.phoneNumber.length() != 10 || !this.phoneNumber.matches("[0-9]+")) {
				errorMessage = "Incorrect phone number";
				errorMessagesList.add(errorMessage);
			}
		}
		
		if (this.email != null && this.email.length() > 0) {
			if (!this.email.matches(
					"(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")) {
				errorMessage = "Incorrect email address";
				errorMessagesList.add(errorMessage);
			}
		}

		errorMessages = errorMessagesList.toArray(errorMessages);
		return errorMessages;
	}

}