package com;

import java.util.Scanner;

public class SumOfNaturalNum {
	
	public static void natural(int []n) {
		int sum=0;
		for(int i=0;i<n.length;i++) {
			sum=sum+n[i];
		} System.out.println(sum);
	}
	
	
	
	
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("How many numbers u want to enter?");
	int num=sc.nextInt();
	System.out.println("Enetr the numbers");
	int []numlist= new int[num];
	for(int i=0;i<numlist.length;i++) {
		numlist[i]=sc.nextInt();
	}
	natural(numlist);
}
}
