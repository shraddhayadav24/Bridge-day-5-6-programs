package com.bridge.pb;

import java.util.Scanner;

public class Array2D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number for rows");
		int row=sc.nextInt();
		System.out.println("Enter the number for col");
		int col=sc.nextInt();
		int a[][]=new int [row][col];
		System.out.println("Enter the elements:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				 a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
