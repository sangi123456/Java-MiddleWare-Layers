package com.merchandise.services;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.merchandise.entities.Customer;
import com.merchandise.entities.Supplier;


 //Service class provides methods for saving customer details, saving supplier
  //details, accessing lists of customers and suppliers, searching customer by id
 
    public class MainService {

	//saves customer details to customers array if the array is not full
	public void saveCustomerDetails(Customer cust) {

		// check is customers array full and if it is print error msg
		
		if (Customer.getCustomers()[Customer.getCustomers().length - 1] != null)
			System.err.println("Maximum number of customers reached. Cannot save a new customer.\n");
		else {
			
			// save customer's details to list
			Customer[] customersList;
			customersList = Customer.getCustomers();
			for (int i = 0; i < customersList.length; i++) {
				if (customersList[i] == null) {
					customersList[i] = cust;
					Customer.setCustomers(customersList);
					System.out.println("Customer's details saved.\n");
					break;
				}
			}
		}
	}

	
	 //returns customers array as a list of customers
	 public List<Customer> getAllCustomers() {
		List<Customer> customersList;
		customersList = new ArrayList(Arrays.asList(Customer.getCustomers()));
		return customersList;
	}

	 //allows to search customer by id
	public Customer getCustomerById(int customerId) {
		
		// get list of customers
		Customer[] customersList = Customer.getCustomers();
		
		// search list for id
		for (Customer customer : customersList) {
			if (customer != null) {
				if (customer.getPartnerId() == customerId)
					return customer;
			}
		}
		// if no customer found return null
		return null;
	}

	//saves supplier details in supplier array if the array is not full
	public void saveSupplierDetails(Supplier supp) {

		// check the list is not full
		if (Supplier.getSuppliers()[Supplier.getSuppliers().length - 1] != null)
			System.err.println("Maximum number of suppliers reached. cannot add new supplier.\n");
		else {
			
			// add supplier details to list
			Supplier[] suppliersList;
			suppliersList = Supplier.getSuppliers();
			for (int i = 0; i < suppliersList.length; i++) {
				if (suppliersList[i] == null) {
					suppliersList[i] = supp;
					Supplier.setSuppliers(suppliersList);
					System.out.println("Supplier's details saved.\n");
					break;
				}
			}
		}
	}

	// returns suppliers array as a list
	public List<Supplier> getAllSuppliers() {
		
		// convert array to list
		List<Supplier> suppliersList;
		suppliersList = new ArrayList(Arrays.asList(Supplier.getSuppliers()));
		return suppliersList;
	}

	// write to details in pdf formats
	public String saveDetailsToPDF(String headline, ArrayList partnersList, String filePath) {
		String message;
		message = "Report not generated succssfully";
		Document document;
		document = new Document();
		FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream(filePath);
			PdfWriter.getInstance(document, fileOutputStream);
			document.open();
			document.add(new Paragraph (headline));
			document.add(new Paragraph (" "));
			for (Object partner : partnersList) {
				if (partner != null)
					document.add(new Paragraph (partner.toString()));
					document.add(new Paragraph (" "));
			}
			message = "Report has been generated";
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		} finally {
			document.close();
		}

		return message;
	}

}