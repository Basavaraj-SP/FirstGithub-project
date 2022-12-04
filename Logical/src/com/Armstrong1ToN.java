package com;

import java.util.Scanner;

public class Armstrong1ToN {

	public static int count(int num) {
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		return count;
	}
	public static int power(int num,int count) {
		int firstvalue=1;
		while(count>0) {
			firstvalue=firstvalue*num;
			count--;
		}
		return firstvalue;
	}
	public static int result(int num) {
		int c=count(num);
		int temp=num;
		int sum=0;
		while(temp>0) {
			int rem=temp%10;
			sum=sum+power(rem,c);
			temp=temp/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
//		int result1=result( num);
//		if(result1==num) {
//			System.out.println("Armstrong");
		for(int i=100;i<=num;i++) {
			int result1=result(i);
			if(result1==i) {
				System.out.println("The given no "+i+" is armstrong");
			}
		}
	}
}
