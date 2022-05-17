package com.training.core.interfacepack;

public class TestMyClass {

	public static void main(String[] args) {
		
		MyClass obj = new MyClass();
	    obj.banner(obj.banner("Welcome to Interfaces"));
	    obj.show();
	    obj.display();
		System.out.println("Random Value - " + obj.ownMethod());
		System.out.println(MyClass.count);
	    System.out.println(MyInterface1.count);
	    
	    //reference of Interface
	    MyInterface1 interfaceobj;
	    
	    //polymorphic 
	    interfaceobj = new MyClass();
	    
	    //we can point to an object o a class who has implement class
	    interfaceobj.banner("called frm Interface reference");
	    
	    
	}
	
}
