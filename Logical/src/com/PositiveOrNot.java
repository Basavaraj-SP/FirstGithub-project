package com;

import java.util.Scanner;

public class PositiveOrNot {
	
	public static void num(int no) {
		if(no<0) {
			System.out.println("The given no is negative");
		}
		else {
			System.out.println("The given no is positive");
		}
			
	}
	
	
	
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int number=sc.nextInt();
	num(number);
	
}
}
