package com.training.api.core;

public class Account 
{
	// by default, properties are default not public
	
	//challenge3 - Autogenerate the accountId for every object
	
	public long accountId; //unique number
	public String holderName;// replace by customer class later
	public String accountType; //it could be type saving or current or fixed or rd
	public double balance; //amount

/*
* Adds default vanilla constructor within the class by java compiler
*public Account(){
*this.accountid=0;
*this.holderName = null;
*
*}
*/
	
//methods: setter, getter, constructor, 
//static, abstract, business logic(deposit, withdraw)
	
//*****Challange- rewrite the logic based on accounttype: savings & current
  
public void withdraw(double amount) {
	//saving account
      if(amount <=0 || this.balance < amount)
 	 {
         System.err.println("Insufficient Balance");
       }
      else
   {
       this.balance=this.balance-amount;
    }
      }
	
	public void deposit(double amount) {
   
	  this.balance += amount;
       }
       
       public void autoIncrementAccountId() 
       {
    	   
       }
       //acc1.getBalance();//this will be referred to acc1
       //acc2.getBalance(); //this will be referred to acc2
       //this is a reference variable pointing to the 
       //current object
       
      //"hello" + 2 = "hello2"
       
      public String getAccountDetails() 
  {
  return "[" + this.accountId + ":" + this.holderName + ":" + this.accountType + ":" + this.balance + "]";
    	   }
  
/*  //private property = 2 methods [getXXX() or setXXX()]
  //private  holdername
 */ 
  
  public void setHolderName(String value) {
	    this.holderName = value;
	   }
  public String getHolderName() {
	  return this.holderName;
  }
 
  public long getAccountId() {
	 return accountId; 
  }
  
  

public String getAccountType() {
	  return accountType;
  }
  
  /*public void setAccountType(String accountType) {
	  this.accountType= accountType;
  }*/

  public void setBalance(double balance) {
	  this.balance = balance;
  }
  
  public double getBalance() {
	  return this.balance;
  }
  
  public Account(long accountId, String holderName, String accountType, double balance) {
		this.accountId = accountId;
		this.holderName = holderName;
		this.accountType = accountType;
		this.balance = balance;
	}

   public Account(long accountId, String holderName, String accountType) {
	this.accountId = accountId;
	this.holderName = holderName;
	this.accountType = accountType;
}
  /*
   * public Account(){
   * System.out.println("No-args Account constrctor");
   * }
   */
  
}