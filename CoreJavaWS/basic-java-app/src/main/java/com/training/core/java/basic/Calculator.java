package com.training.core.java.basic;
/**
 * 
 * @author Sangit104101
 *Calculator will be an API class
 *methods- add(), subtract(), multiply(), division()
 */
public class Calculator {
      int x;   //instance variable
      
	//to add two integer values and return result
	public int addTwoNumbers(int num1, int num2) {
		System.out.println("Adding two numbers");
		int x = 20;
		
		int sum =0; //local primitive variable
		
		System.out.println("sum = " + sum);
		final int count = 0; //local primitive variable
		System.out.println("x = " + this.x); //instance variable
		System.out.println("local variable x = " + x);
		return num1 + num2;
	}
	
	//to substract two integers values and return value
	public int subTwoNumbers(int num1, int num2) {
		System.out.println("Substracting num1 - num2");
		System.out.println("Num1 = " + num1 + " Num2 = " + num2);
        int result = num1 - num2;
		return result;
		}
	
	public void sumOfNumbers(int...numbers) {
		int sum = 0;  //local primitive variable
		//print sum of numbers
		//traditional for loop 
		for(int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		
		System.out.println("Sum of passed numbers - " + sum);
	}
	
	
	
}
