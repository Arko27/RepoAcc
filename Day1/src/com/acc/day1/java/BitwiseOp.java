package com.acc.day1.java;

import java.util.Scanner;

public class BitwiseOp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two nos: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int bitAnd = a & b;
		int bitOr = a | b;
		int bitXor = a ^ b;
		
		System.out.println("Bitwise AND " + bitAnd);
		System.out.println("Bitwise OR " + bitOr);
		System.out.println("Bitwise XOR " + bitXor);
	}

}
