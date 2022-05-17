package com.training.core.java.basic;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DateOperations {
	
  public static LocalDate getDate(){
	  //create date object and return it
	  LocalDate todayDate = LocalDate.now();
	  return todayDate;
  }
  
   //method Signature
  public static void printDateDetails(LocalDate d ) {
	  
	  System.out.println("Year of the date - " + d.getYear());
	  System.out.println("Day of the Year - " + d.getDayOfYear());
	  
	  Month month = d.getMonth();
	  System.out.println("Month of the date - " + d.getMonthValue() );
	  
	 DayOfWeek dow = d.getDayOfWeek();
	 System.out.println("Day of the week - " + dow.getValue());
    	
  }
  
  public static void add(int a, int b) {}
  
  
  public static void main(String[] args) {
	  
	  LocalDate x = getDate();
	  System.out.println("Today's date - " + x);
	  
	  add(10,20);
    //pass the date object to another method to print day, 
	  //month and year
    //the week, day of the year
	  
	  printDateDetails(x);
  
  
  }
}
