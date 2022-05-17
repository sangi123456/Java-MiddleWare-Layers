package com.merchandise.entities;

import java.util.ArrayList;
import java.util.Arrays;

public class Supplier extends Merchandise {
	
	/**
	 * suppliers array contains the list of all suppliers created by the user
	 */
	private static Supplier[] suppliers;
	private float creditBalance;
	private String drivingLicenseNumber;

	static {
		suppliers = new Supplier[5];
	}
	
	
	public Supplier(int partnerId, String partnerName, String city, String state, float creditBalance,
			String drivingLicenseNumber) {
		super(partnerId, partnerName, city, state);
		this.creditBalance = creditBalance;
		this.drivingLicenseNumber = drivingLicenseNumber;
	}

	public float getCreditBalance() {
		return creditBalance;
	}

	public String getDrivingLicenseNumber() {
		return drivingLicenseNumber;
	}

	public static Supplier[] getSuppliers() {
		return suppliers;
	}

	public static void setSuppliers(Supplier[] suppliersList) {
		suppliers = suppliersList;
	}

	// to string method
	@Override
	public String toString() {
		String printString;
		printString = super.toString();
		printString += "\nDriving License Number: " + this.drivingLicenseNumber;
		printString += "\nCredit balance: " + this.creditBalance;
		return printString;
	}

	// validate
	@Override
	public String[] validate() {
		String[] errorMessages = new String[7];
		errorMessages = super.validate();
		ArrayList<String> errorMessagesList;
		errorMessagesList = new ArrayList<String>(Arrays.asList(errorMessages));
		String errorMessage = "";

		if (this.creditBalance > 175000) {
			errorMessage = "Credit balance cannot be greater than 175,000";
			errorMessagesList.add(errorMessage);
		}

		if (this.drivingLicenseNumber.length() > 0 && this.drivingLicenseNumber != null) {
			if (!this.drivingLicenseNumber.matches(
					"^([A-Z]{2}[9]{3}|[A-Z]{3}[9]{2}|[A-Z]{4}[9]{1}|[A-Z]{5})[0-9]{6}([A-Z]{1}[9]{1}|[A-Z]{2})[A-Z0-9]{3}[0-9]{2}$")) {
				errorMessage = "Invalid Driving License Number";
				errorMessagesList.add(errorMessage);
			}
		}

		errorMessages = errorMessagesList.toArray(errorMessages);
		return errorMessages;
	}

}