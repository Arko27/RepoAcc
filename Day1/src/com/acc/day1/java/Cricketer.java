package com.acc.day1.java;

public class Cricketer {

	// InstanceVariables or the identities
	String name, country;
	int age;
	
	// State/behavior of the object
	void get(String name, String country, int age) {
		this.name = name;
		this.country = country;
		this.age = age;
		
		System.out.println("Name is: "+ name);
		System.out.println("Country is: "+ country);
		System.out.println("Age is: "+ age);
	}
	
	// State/behaviour of the object
	void bat() {
		System.out.println("Can do batting");
	}
	
	// State/behaviour of the object
	void bowl() {
		System.out.println("Can do bowling");
	}
	
	// State/behaviour of the object
	void fielding() {
		
		System.out.println("Can do fielding");		
	}
	
	public static void main(String[] args) {
		
		Cricketer cricketer = new Cricketer();
		
		cricketer.get("Sourav Ganguly", "INDIA", 50); 
		cricketer.bat();
		cricketer.bowl();
		cricketer.fielding();
	}
}