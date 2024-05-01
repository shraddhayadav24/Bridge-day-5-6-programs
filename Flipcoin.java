package com.bridge.pb;

import java.util.Scanner;

public class Flipcoin {
	public static void main(String[] args) {
		int headcount=0, tailscount=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of flip");
		int Numberflip = sc.nextInt();
		
		for(int i=0;i<=Numberflip;i++) {
			if(Math.random()<0.5) {
				headcount++;
			}
			else{
				tailscount++;
			}
		}
			System.out.println("headcount: " + headcount);
			System.out.println("tailcount: " + tailscount);
		
			double percentagehead = ((double)headcount/Numberflip)*100;
				System.out.println(percentagehead);
				
			double percentagetail = ((double)tailscount/Numberflip)*100;
				System.out.println(percentagetail);
	}
}
