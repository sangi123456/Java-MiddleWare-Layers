package com.training.core.arrays;

import java.util.Arrays;

    public class SortArray 
{
    	//sort method
   public static void sortNameArray(String[] myarray) {
   Arrays.sort(myarray);
}
   
       public static void printNameArray(String[] myarray) 
    {
       //print data from array.
       for(int i=0;i<myarray.length;i++)
     {
       System.out.println("arr["+i+"]="+myarray[i]);
     }

   }
       
      public static void printArray(int[] myarray) {
       //print data from array.
    	 
         for(int i=0;i<myarray.length;i++) 
       {
          System.out.println("arr["+i+"]="+myarray[i]);}
       }
     
      //printing the sum of an array
       public static void printSum(int[] arr)
        {
           int sum=0;
           for (int i = 0; i < arr.length; i++) {
           sum = sum + arr[i];
         }
           System.out.println("sum:"+sum);
        }

          public static void sortArray(int[] myarray) 
        {
           Arrays.sort(myarray);
       }
           
          //Challenge - create an array of names and sort it

           public static void main(String args[]) 
        {

           String[] array= {"sangu","kitty","pari","vaishu"};// String array & sorting the names
         
         System.out.println("********************************");
         System.out.println("Before Sorting of Names Array");

         printNameArray(array);
         System.out.println("---------------------------------");
         System.out.println("The Length of the Array = " + array.length);
         sortNameArray(array);
         
         System.out.println("*********************************");
         System.out.println("Sorted Elements of Names Array = ");
         printNameArray(array);

          System.out.println("*********************************");
          System.out.println("Total Elements of an Array = ");
         
          int[] arr = null; //reference variable of type int array
          arr = new int[5]; //object of type int array with 5 elements
       
          //initialize the array elements
          arr[0]=40;
          arr[1]=80;
          arr[2]=70;
          arr[3]=90;
          arr[4]=20;
      
          printArray(arr);
         System.out.println("*********************************");

          System.out.println("Sum Of The Elements Of An Array = ");
          printSum(arr);

       
         System.out.println("***************************");
         System.out.println("After Sorting the elemenets of an Array = ");
         
         sortArray(arr);
         printArray(arr);
         
         
        System.out.println("******************************");
        System.out.println("Display The Largest Element of an Array");
        System.out.println("*********************************");
        
        int largest = arr[arr.length-1];
        System.out.println("Largest Element of an Array = " + largest);
  }

}