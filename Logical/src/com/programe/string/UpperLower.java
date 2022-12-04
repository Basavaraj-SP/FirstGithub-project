package com.programe.string;

import java.util.Scanner;

public class UpperLower {
	

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='a' && c<='z' || c>='A' && c<='z') {
			if(c>='a' && c<='z') {
				c=(char) (c-32);
				System.out.print(c);
			}
			
			else if(c>='A' && c<='Z') {
				c= (char)(c+32);
				System.out.print(c);
			}
			}
			else {
				System.out.println("The entered string contains special character");
			}
		}
	}

}
