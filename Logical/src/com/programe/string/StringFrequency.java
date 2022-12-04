package com.programe.string;

import java.util.Scanner;

public class StringFrequency {

public static void main(String[] args) {
	System.out.println("Enter the string");
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	System.out.println("Enter the character");
	char c=sc.next().charAt(0);
	

	int count=0;
	for(int i=0;i<s.length();i++) {
		if(c==s.charAt(i)) {
			count++;
		}
	}
	System.out.println("The count is "+count);
	
}
}
