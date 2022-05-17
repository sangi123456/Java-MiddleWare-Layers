package com.merchandise.entities;

import java.util.ArrayList;

public class Merchandise {
	
	private int partnerId;
	private String partnerName;
	private String city;
	private String state;
	
	public Merchandise(int partnerId, String partnerName, String city, String state) {

		this.partnerId = partnerId;
		this.partnerName = partnerName;
		this.city = city;
		this.state = state;
	}

	public int getPartnerId() {
		return this.partnerId;
	}

	public String getPartnerName() {
		return this.partnerName;
	}

	public String getCity() {
		return this.city;
	}

	public String getState() {
		return this.state;
	}

	// validate() method
	public String[] validate() {
		String[] errorMessages = new String[5];
		ArrayList<String> errorMessagesList;
		errorMessagesList = new ArrayList<String>();
		String errorMessage = "";
		if (this.partnerId <= 0) {
			errorMessage = "PartnerId value is mandatory and must be a positive number";
			errorMessagesList.add(errorMessage);
		}
		if (this.partnerName == null || this.partnerName.length() < 5) {
			errorMessage = "Name must have at least 5 characters";
			errorMessagesList.add(errorMessage);
		}
		if (this.city == null || this.city.length() < 3) {
			errorMessage = "City must have at least 3 characters";
			errorMessagesList.add(errorMessage);
		}
		if (this.state == null || this.state.length() < 3) {
			errorMessage = "State must have at least 3 characters";
			errorMessagesList.add(errorMessage);
		}
		errorMessages = errorMessagesList.toArray(errorMessages);
		return errorMessages;
	}

	@Override
	public String toString() {
		return "Partner id: " + this.partnerId + "\nName: " + this.partnerName + "\nCity: " + this.city + "\nState: "
				+ this.state;
	}

}