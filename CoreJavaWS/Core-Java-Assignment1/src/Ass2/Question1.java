package Ass2;

public class Question1 {
 
public static void main(String[] args) {
	
	 //Java Program - Find Smallest of Three Numbers
	        
	     //three numbers
	
	        int a = 50;
	        int b = 30;
	        int c = 70;
	         
	        int smallest;
	         
	     if(a<b && a<c) 
	     {
	        smallest = a;
	        
	     } 
	     else if (b<c) 
	     {
	         smallest = b;
	      } 
	     else 
	     {
	        smallest = c;
	      }
	         
	        System.out.println(smallest + " is the smallest.");
	    }
	}

