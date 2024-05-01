package com.bridge.pb;

import java.util.Scanner;

public class PrintUsername {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Username");
		String username= sc.nextLine();
		if(username.length()< 3)
		{
			return;
		
		}
		String s1="Hello <<UserName>>, How are you?";
		 s1=s1.replace("<<UserName>>", username);
		System.out.println(s1);
		
	}

}
