package com.bridge.pb;

import java.util.Scanner;

public class LargestThreeNo {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the three no:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a);
		}else if(b>a && b>c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
	}
}
