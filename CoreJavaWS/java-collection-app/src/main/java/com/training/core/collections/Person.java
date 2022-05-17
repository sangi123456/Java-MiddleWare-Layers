package com.training.core.collections;

import java.io.Serializable;

public class Person implements Serializable{

	
	private int id;
	private String name;
	private int age;
	
	//getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//constructor
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
		
	
	}
	
	//hashcode method()
	@Override
	public int hashCode() {
	System.out.println("hashcode");
		return super.hashCode();
	}
	
	//hashcode equals
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		Person p = (Person) obj;
		return (this.id == p.id) && (this.name.equals(p.name)) && (this.age == p.age);
	}
	
}
