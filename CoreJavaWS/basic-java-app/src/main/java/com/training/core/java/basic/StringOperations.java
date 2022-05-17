package com.training.core.java.basic;


   public class StringOperations {

//add a method that accepts a string and return it in uppercase
    public String convertToUppercase(String str) {
      if(str != null) {
    	  return str.toUpperCase();
      }
      else {
    	return "No valid data to covert";  
      }
     }

// a method that accepts two strings and compare them for equality
public static boolean compareTwoStrings(String str1, String str2) {
   return str1.equals(str2);
	 }

   //palindrome

   public static void palindrome(String str1) {
	   
    String str2 = "";
    
    for(int i = str1.length(); i > 0; i--) {
       str2 += str1.charAt(i - 1);
       }
    
     if (str1.equals(str2)) 
     {
        System.out.println(str1 + " is a palindrome");
    }
     
   else 
{
   System.out.println(str1 + " is not a palindrome");
}
}

   }