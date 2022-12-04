package com;

import java.util.Scanner;

public class SwappingOfTwoNumbers {
	
	public static void swap(int n1,int n2) {
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("the value of n1:"+n1+" and the value of n2:"+n2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the numbers:");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	swap(n1,n2);
	}

}
