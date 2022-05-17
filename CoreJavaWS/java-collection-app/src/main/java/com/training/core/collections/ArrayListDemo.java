package com.training.core.collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList  list;
		
		list = new ArrayList();
		
		System.out.println(" Initialize size of ArrayList -" + list.size());
		
		list.add(new String("sangita"));
		list.add(new String("sakshi"));
		
		//check the size
		System.out.println(" Initialize size of ArrayList - " + list.size());
	      //print the arraylist
		System.out.println("Data in the list - " + list);
	   
		
		list.add(new Integer(10)); //position where elelemnt will be added - end of arrayList
		//check the size
		System.out.println(" After adding 3 element, size of  ArrayList - " + list.size());
		//print the arrayList
	    System.out.println("Data in the List - " + list);
	
	   list.add(0, new Float(30.89));
	  //check the size
	  System.out.println(" After adding 3 element, size of  ArrayList - " + list.size());
	  //print the arrayList
	  System.out.println("Data in the List - " + list);
	
	  //add null
	  list.add(null);
	  list.add(null);
	   //check the size
	   System.out.println(" After adding 3 element, size of  ArrayList - " + list.size());
      //print the arrayList
       System.out.println("Data in the List - " + list);
       
       list.add(new String("sakshi"));
     //check the size
     System.out.println(" After adding 3 element, size of  ArrayList - " + list.size());
     //print the arrayList
      System.out.println("Data in the List - " + list);
      
      //get the elemenet on specific position
      
      Object obj = list.get(1);
      String str = (String)  obj;
      
      System.out.println("Position 1 data -" + str.toUpperCase());
	 
      //remove an element
      String removeObject = (String) list.remove(2);
      System.out.println(" After removing 2 element, size of  ArrayList - " + list.size());
      //print the arrayList
      System.out.println("Data in the List - " + list);
      
      //remove range
      System.out.println("is list empty? " + list.isEmpty());
      
      //search element in the array list
	   String search = new String("sangita");
	   
	   boolean result = list.contains(search);
	   System.out.println("Search result for string object with sangita value - " + result );
	   
	   //manually iterate the list
	   //traverse the list, it returns
	   for (Object object : list) {
		   Float f = (Float) object;
		   System.out.println("Object - " + f.toString());
		   }

	 }	   
}

