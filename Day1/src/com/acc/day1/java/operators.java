package com.acc.day1.java;
import java.util.*;

public class operators {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two nos: ");
		int a =sc.nextInt();
		int b = sc.nextInt();
		int e = b;
		
		b /= a;
		System.out.println("Divide Assignment " + b);
		e %= a;
		System.out.println("Modulo Assignment " + e);
		
		int c = a++;
		int d = b--;
		
		System.out.println("Increment " + c);
		System.out.println("Decrement " + d);
	}
}