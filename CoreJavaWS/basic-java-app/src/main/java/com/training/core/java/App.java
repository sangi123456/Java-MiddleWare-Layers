package com.training.core.java;

import com.training.core.java.basic.Calculator;

/**
 * Hello world!
 *
 */
public class App 
{
	//Calculator calc; //reference instance 
	//JVM -main() is a single thread
    public static void main( String[] args )
    {
    	  //declare a variable of type string
    	  //String name ="sangita";
    	  
           //System.out.println( "Hello World! - " + name );
           
          // System.out.println("Thread name - " + Thread.currentThread().getName());
         
          //Thread.currentThread().setName("MyMainThread");
          
       //  System.out.println("Thread name - " + Thread.currentThread().getName());
       
    	//creating a object of Calculator class
         Calculator calc = null;//local reference variable
       
         calc = new Calculator(); //object of type calculator is created in the memory
           System.out.println("calc - " + calc);
         int result = calc.addTwoNumbers(10, 20);
        System.out.println("Addition of two number - " + result);
         result = calc.subTwoNumbers(10, 20);
         System.out.println("Subtraction of two Numbers - " + result);
        calc.sumOfNumbers(10, 20, 40, 50, 60, 78, 80);
    }
}

