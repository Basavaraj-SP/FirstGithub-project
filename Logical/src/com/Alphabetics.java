package com;

import java.util.Scanner;

public class Alphabetics {

	public static void alpha(char c) {
		
		System.out.println("The alphabets are: ");
		if((c>='a')&&(c<='z')) {
		for(char b=c;b<='z';b++) { 
			System.out.println(b);
		}
		}
		else if((c>='A')&&(c<='Z')) {
		for(char b=c;b<='Z';b++) { 
			
			System.out.println(b);
		}
		}
	}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char c=sc.next().charAt(0);
		alpha(c);
	}
}
