package com.training.core;

import com.training.core.unchecked.UncheckedExceptionDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       int result = UncheckedExceptionDemo.divideNumbers2(4,2);
      System.out.println("Division Result  -" + result);
       
      System.out.println("*****************************");
      
       result = UncheckedExceptionDemo.divideNumbers2(4,0);
       System.out.println("Division Result - " + result);
   
    }
    
}
