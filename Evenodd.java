package com.bridge.pb;

import java.util.Scanner;

public class Evenodd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}
}