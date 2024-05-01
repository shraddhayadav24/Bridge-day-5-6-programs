package com.bridge.pb;

public class QuadraticFunction {
	public static void main(String[] args) {
		int a=5, b=9,c=3;

		int delta= b*b - 4*a*c;
		System.out.println(delta);
		if(delta>0) {
			double root1=(-b + Math.sqrt(delta))/(2*a);
			double root2= (-b - Math.sqrt(delta))/(2*a);
			
			System.out.println(root1);
			System.out.println(root2);
		}
		
	}

}
