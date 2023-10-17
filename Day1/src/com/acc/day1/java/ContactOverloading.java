package com.acc.day1.java;
import java.util.Scanner;

public class ContactOverloading {

	String name;
	long num1, num2;
	
	void contact(String name, long num1) {
		this.name = name;
		this.num1 = num1;
		
		System.out.println("Name is: " + name);
		System.out.println("The Number is: " + num1);
	}
	
	void contact(String name, long num1, long num2) {
		this.name = name;
		this.num1 = num1;
		this.num2 = num2;
		
		System.out.println("Name is: " + name);
		System.out.println("The First Number is: " + num1);
		System.out.println("The Second Number is: " + num2);
	}
	
	public static void main(String[] args) {
		
		ContactOverloading cont = new ContactOverloading();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		String n = sc.nextLine();
		System.out.println("Enter the first no:");
		long no1 = sc.nextLong();
		System.out.println("Enter the second no:");
		long no2 = sc.nextLong();
		cont.contact(n, no1, no2);
	}
}