package com.acc.day1.java;

public class ChangeArraySize {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		
		System.out.println("Lenght between: " + arr.length);
		arr = java.util.Arrays.copyOf(arr, arr.length * 2);
		System.out.println("Lenght between: " + arr.length);
	}
}