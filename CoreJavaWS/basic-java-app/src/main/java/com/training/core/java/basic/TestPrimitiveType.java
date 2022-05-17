package com.training.core.java.basic;

public class TestPrimitiveType {
	
public static void main(String[] args) {
	//default decimal value assigned to a varibale 
	//is understood
	//as double by JVM
	//java is strict on data types or
	//Java is statically typed language
	 
	 double d =10;
	 System.out.println("value of d - " + d);
	int x, y, z = 0; //x=0, y=0, z=0
	
	//initialize y variable 
	int x1 = 10;

	// initialize y variable
	int y1 = x1; // copy by-value

	System.out.println("x = " + x1 + "y = " + y1);
	
	String str1 = new String("hello");
	String str2;
	str2 = str1;

	String str3 = null;
	System.out.println("upper case - " + str3.toUpperCase());
}
}