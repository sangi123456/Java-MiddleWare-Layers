package com.training.core.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {
	
		Set<Person> set = new HashSet<Person>();
	
		//adding objects
		set.add(new Person(1, "sangita", 23));
		set.add(new Person(2, "sakshi", 24)); //object - equal on data they cannot be equal on hashcode
		set.add(new Person(3, "seema", 25));
		
		System.out.println("Size of set - " + set.size());
		System.out.println("Data in set- " + set);
		
		//add a duplicate object
		set.add(new Person(2, "sangita", 24));//object

		System.out.println("Size of set - " + set.size());
		System.out.println("Data in set- " + set);
		
		
		
	}

	
}
