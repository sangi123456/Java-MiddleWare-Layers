package com.training.core.arrays;

import java.util.Arrays;

public class SortingArray {
	
	public static void main(String[] args) {
		String[] arr = new String[3];
		arr[0] = "Sangita";
		arr[1] = "Sweta";
		
		String[] arr1 = new String[3];
		System.out.println("Length of arr1 - " + arr1.length);
		
		String[] names = {"Sangita", "Sweta", "pooja"};
		Arrays.sort(names);
		
		System.out.println(Arrays.toString(names));
		
		//print array 
		//forEach = JDK 1.5
		for(String x: names) {
			System.out.println(x.toUpperCase());
		}
		
		//sorting of customers
		
		
	}

}
