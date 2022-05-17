package com.training.api.inheritance.test;

import java.util.ArrayList;
import java.util.List;

import com.training.api.inheritance.Account;
import com.training.api.inheritance.Current;
import com.training.api.inheritance.Savings;

public class TestAccountCollection { 
	
	public static void main(String[] args) {

     //to avoid ClassCastException, jdk1.5
    //Generics is a <E> placeholder that defins what type of data can be added into collection
     //generice declaration for the compile to check.
    //generics ensure that you create a type-safe collection
    //<class-type> : you can add objects of that class type or you can add its child
		
      List<Account> list;
     list = new ArrayList<Account>();
     list.add(new Savings(1000L, "jill",3456, 2000));
     
      //list.add("john);
      //list.add(10); //new Integer(10)
      //list.add(39.98) //new Double(39.98)
     
      list.add(new Current(2000L, "peter",45000,3000));
      
      list.add(new Current(2000L, "john",78000,20000));
      
      list.add(new Savings(2000L, "aman",85000,10000));
     
    System.out.println(list);
}
	}


	