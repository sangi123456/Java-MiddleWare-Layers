package com.training.core.unchecked;

public class UncheckedExceptionDemo {
	
 public static int divideNumbers (int num1, int num2) {
	
	 System.out.println("Within divideNumber method ");
	 int result = 0;
	
	 //one try can have multiple catch block
	   try 
	 {
	    result =  num1/ num2; //JVM create Arithmetic Exception
	    String str = null;
	    System.out.println(str.toUpperCase());//exception will be raised
	    return result; 
	  }
	   
	    catch(ArithmeticException e)
	   {
		   System.err.println("In division, the other number cannot be zero  ");
	       System.err.println(e.getMessage());
	    }
	    catch(Exception e) {
		   System.err.println("some unknown error");
	   }
	   
	   return result;
	}
 
 public static int divideNumbers2 (int num1, int num2) {
	 int result = 0;
	 if(num2 == 0) {
		 return 0;
	 }
	 return num1/num2;
 }
 
}