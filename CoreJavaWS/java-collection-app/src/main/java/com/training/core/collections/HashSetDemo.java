package com.training.core.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	
   public static void main(String[] args) {
	//set Interface - > Hashset(hash algorithm), Treeset(binary trees)	
	//set Implementaions do not follow order (non-squential) & do not duplicate o
	   //object + single null
	   
	   //HashSet<Integer> set = new Hashset<Integer>
	Set<Integer> set = new HashSet<Integer>();
	
	//size of hashset
	System.out.println("Size of Hashset -" + set.size());
	
	set.add(10); //new Integer(10);
	set.add(20);
	set.add(10);
	set.add(10);
	set.add(20);
	
	//size of hashset
	System.out.println("Size of Hashset -" + set.size());
	System.out.println("set data - " + set);
	
	set.add(35);
	set.add(78);
	
	//size of set
	System.out.println("Size of Hashset -" + set.size());
	System.out.println("set data - " + set);
	
   //remove object from set
	boolean result = set.remove(new Integer(20));
	System.out.println("remove of va;lue 20 - " + result);
	System.out.println("set data - " + set);
	
	//search in set
	result = set.contains(78);
	System.out.println("Search value 78 - " + result );
	
	//Iterator -Interface is used to trasverse in set
	//old way- use List as well as Set
	Iterator<Integer> it = set.iterator();
	while(it.hasNext()) {
		System.out.println("Inside Iterator ");
		 Integer iobj = it.next();
		 System.out.println("data - " + iobj);
	}
	
	//new way in jdk 1.5
	for (Integer integer : set ) {
		System.out.println(integer);
	}
	
}
   
}
