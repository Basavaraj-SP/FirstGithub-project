package com;


import java.util.Scanner;

public class SpecialNumber {
	static void isSpecial(int num)
	{
	int m=num/10;
	int n=num%10;
	int p =((m+n)+(m*n));
	if(p==num) {
		System.out.println("The given number:"+num+" is special");
	}
	else
	{
		System.out.println("The given number:"+num+" is not special");
	}

		return ;
		
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int number=sc.nextInt();
	isSpecial(number);
	
}
}
