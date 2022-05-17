package com.training.core.arrays;

import java.util.Arrays;

public class ArrayDemo {
	
	//int[] myarray declares a reference variable of type int[] array
	//int myarray[] = arr;
	//function within the class- call the method-they are part of object
	
	public static void printArray(int[] myarray) {
		
		//print the data from array
		//loop run for i=0, i=1, i=2, i=3, i=4, 5 not there
		for(int i = 0; i < myarray.length; i++ ) {
			System.out.println("arr[" + i + "] = " + myarray[i]);
		}
	}
	
	public static void sortArray(int[] myarray) {
		Arrays.sort(myarray);
	}
	
	public static void main(String[] args) {
	int[] arr = null; //reference variable of type int array
	arr = new int[5]; //object of type int array with 5 elements
	
	System.out.println("The length of arr = " + arr.length);
	printArray(arr);
	
	//initialize the array element
	arr[0] = 20;
	arr[1] = 25;
	arr[2] = 3;
	arr[3] = 45;
	arr[4] = 12;
	
	System.out.println("********************************************");
	System.out.println("After array elements are initialized.. ");
	printArray(arr);
	
	System.out.println("***************************");
	//call the sory array method
	System.out.println("After Sorting Array ");
	sortArray(arr);
	printArray(arr);
	System.out.println("**************************");
	
	
	//line raises a runtime error - arrayIndexoutofBound- which means u tried to access element outside the array
	//code will be terminated on line 31
	arr[5] = 60;
	arr[6] = 70;
	
	System.out.println("After 5th  & 6th elements array are initialized..");
	printArray(arr);
	
	}
}
