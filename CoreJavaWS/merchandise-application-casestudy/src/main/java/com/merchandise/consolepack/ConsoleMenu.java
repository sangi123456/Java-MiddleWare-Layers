package com.merchandise.consolepack;

import java.util.ArrayList;
import java.util.Scanner;

import com.merchandise.entities.Customer;
import com.merchandise.entities.Supplier;
import com.merchandise.services.MainService;

public class ConsoleMenu {

	private static MainService service = new MainService();

	public static void displayMenu() {
		System.out.println("-------------------------------------------------");
		System.out.println("Please choose one of the following options:\n" 
		                    + "1. Add Customer\r\n"
				            + "2. Add Supplier\r\n" 
		                    + "3.Genarating All details \r\n" 
				            + "\t i. Customers\r\n"
		                    + "\t ii. Suppliers\r\n"
				            + "4. Search\r\n" 
		                    + "5. Exit");
		System.out.println("---------------------------------------------------");
	}
	
	
	public static void main(String[] args) {

		Scanner scanner;
		scanner = new Scanner(System.in);
		String optionSelected;
		optionSelected = "";
		
		
		while (!optionSelected.equals("5")) {
			displayMenu();
			optionSelected = scanner.nextLine().toLowerCase();
			switch (optionSelected) {

			// close the program
			case "5":
				break;

			// add customer
			case "1":
				// get customer details from the user
				int customerId = -1;
				String customerName;
				String city;
				String state;
				Float creditLimit;
				String phoneNumber;
				String email;

				System.out.println(" Enter following customer details:\n");
				System.out.println("Customer id");
				try {
					customerId = scanner.nextInt();
				} catch (Exception exception) {
					System.err.println("Customer id must be a whole positive number");
					scanner.nextLine();
					break;
				}
				scanner.nextLine();
				System.out.println("Name: ");
				customerName = scanner.nextLine();
				System.out.println("City: ");
				city = scanner.nextLine();
				System.out.println("State:");
				state = scanner.nextLine();
				System.out.println("Credit limit:");
				try {
					creditLimit = scanner.nextFloat();
				} catch (Exception exception) {
					System.err.println("Credit limit must be a number");
					scanner.nextLine();
					break;
				}
				scanner.nextLine();

				System.out.println("Phone number: ");
				phoneNumber = scanner.nextLine();

				System.out.println("E-mail address: ");
				email = scanner.nextLine();

				System.out.println();

				// create customer object with details provided by the user
				Customer newCustomer;
				newCustomer = new Customer(customerId, customerName, city, state, creditLimit, phoneNumber, email);

				// validate the properties
				String[] customerValidationErrors = newCustomer.validate();

				// if validation fails display an error message
				boolean passValidation;
				passValidation = true;

				for (String errorMessage : customerValidationErrors) {
					if (errorMessage != null) {
						passValidation = false;
						System.out.println(errorMessage);
					}
				}

				// if validation passed add user to the array
				if (passValidation) {
					service.saveCustomerDetails(newCustomer);
				} else {
					System.out.println("\nThe customer could not be added\n");
				}

				break;

			// write the code- add supplier
			case "2":
				// get supplier details from the user
				int supplierId;
				String supplierName;
				Float creditBalance;
				String drivingLicenseNumber;

				System.out.println("Please enter following customer details:\n");
				System.out.println("Supplier id: ");
				try {
					supplierId = scanner.nextInt();
				} catch (Exception exception) {
					System.err.println("Supplier id must be a whole positive number");
					scanner.nextLine();
					break;
				}
				
				scanner.nextLine();
				System.out.println("Name: ");
				supplierName = scanner.nextLine();
				System.out.println("City: ");
				city = scanner.nextLine();
				System.out.println("State:");
				state = scanner.nextLine();

				System.out.println("Credit balance:");
				try {
					creditBalance = scanner.nextFloat();
				} catch (Exception exception) {
					System.err.println("Credit balance must be a number");
					scanner.nextLine();
					break;
				}
				scanner.nextLine();

				System.out.println("Driving license number: ");
				drivingLicenseNumber = scanner.nextLine();

				System.out.println();

				// create customer object with details provided by the user
				Supplier newSupplier;
				newSupplier = new Supplier(supplierId, supplierName, city, state, creditBalance, drivingLicenseNumber);

				// validate the properties
				String[] supplierValidationErrors = newSupplier.validate();

				// if validation fails display an error message
				passValidation = true;

				for (String errorMessage : supplierValidationErrors) {
					if (errorMessage != null) {
						passValidation = false;
						System.out.println(errorMessage);
					}
				}

				// if validation passed add user to the array
				if (passValidation) {
					service.saveSupplierDetails(newSupplier);
				} else {
					System.out.println("\nThe supplier could not be added\n");
				}

				break;

			// print details of reports
			case "3":
				System.out.println(" Select i for the customers details or ii for the suppliers details");
				break;

			// print all customers' details
			case "i":
				ArrayList<Customer> customersList;
				customersList = (ArrayList<Customer>) service.getAllCustomers();
				String filePath = "";
				System.out.println("Enter file destination folder: ");
				filePath = scanner.nextLine();
				filePath += ".pdf";
				String reportResult = service.saveDetailsToPDF("LIST OF ALL CUSTOMERS", customersList, filePath);
				System.out.println(reportResult);
				break;
			
			// print all suppliers' details
			case "ii":
				ArrayList<Supplier> suppliersList;
				suppliersList = (ArrayList<Supplier>) service.getAllSuppliers();
				filePath = "";
				System.out.println("Enter the location of file folder: ");
				filePath = scanner.nextLine();
				filePath += ".pdf";
				reportResult = service.saveDetailsToPDF("LIST OF ALL SUPPLIERS", suppliersList, filePath);
				System.out.println(reportResult);
				break;
			
			// search customer by id
			case "4":	
				// get customer id
				System.out.println("Provide customer id: ");
				//if user input is not a number display error message
				try {
					customerId = scanner.nextInt();
				} catch (Exception exception) {
					System.err.println("Customer id must be an integer");
					scanner.nextLine();
					break;
				}
				scanner.nextLine();
				
				Customer customer = service.getCustomerById(customerId);
				if (customer == null)
					System.out.println("Invlid Customer Id: \n");
				else
					System.out.println(customer + "\n");
				break;

			// Display an error message if user input not in options
			default:
	        System.err.println("Please choose one of the following options: \n");

			}
		}

		scanner.close();
	}
}
