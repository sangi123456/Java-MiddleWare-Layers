package com.training.core.interfacepack;

public  class MyClass implements MyInterface1, MyInterface2 {

	public void display() {
		System.out.println("display() method");
	}
	
	public void show() {
		System.out.println("show() method");
		int sum = 10 + MyInterface1.count;
		System.out.println("sum = " + sum);
	}

	public String banner(String str) {
		return str.toUpperCase();
	}

	public double ownMethod() {
		
		return  5 + (Math.random() * 30 );
	}

}
