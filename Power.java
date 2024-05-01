package com.bridge.pb;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		int base, exponent;
		int result=1;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the base");
		base=sc.nextInt();
		
		System.out.println("Enter the exponent");
		exponent=sc.nextInt();
		
		for(int i=0; i<exponent;i++) {
		result=result*base;
		}
		System.out.println("The power is: " + result);
	}
}
