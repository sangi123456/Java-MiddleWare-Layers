package QUESTIONS;


public class Question1
{
    public static void main(String[] args) 
    {
        int num1 = 27, num2 = 2;  //Declare and initialize the numbers
        
        System.out.println("The entered number is: "+num1);
        
      
        int quotient = num1 / num2;   //Find quotient
        
        int remainder = num1 % num2;  //Find Remainder
        
        System.out.println("After division the quotient and remainder are: ");
        //Print the quotient and remainder
        
        System.out.println("The quotient is: " + quotient);
        
        System.out.println("The remainder is: " + remainder);
    }
}