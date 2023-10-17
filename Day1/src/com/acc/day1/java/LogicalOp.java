package com.acc.day1.java;

import java.util.Scanner;

public class LogicalOp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two nos: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a >= 5 && b <= 20)
			System.out.println("Within Limit");
		else if(!(a > 5))
			System.out.println("Lower Range not within Limit");
		else
			System.err.println("Wrong Input");
		
		
	}
}