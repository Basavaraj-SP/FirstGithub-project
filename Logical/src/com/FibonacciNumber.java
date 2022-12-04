package com;

//Sum of 5

import java.util.Scanner;

public class FibonacciNumber {

//	public static void faebo(int num) { // 5
//		System.out.println("Fibonacci series of " + num);
//		int n1 = 0, n2 = 1, n3;
//		int n4=500;
//		System.out.print(n1 + "," + n2 + ",");
//		for (int i =2; i <num; i++) {
//			n3 = n1 + n2; // 3 1
//			n1 = n2;
//			n2 = n3;
//			System.out.print(n3 + ",");
//		}
//	}
	
	
 public static void faebo( int num) {
	 int n1=0,n2=1,sum=0;
	 int i=1;
	 while(i<=num) {  // while(n1<=500)==> for printing value upto 500 
		 System.out.print(n1+",");
		 sum=n1+n2;
		 n1=n2;
		 n2=sum;
		 i++;
	 }
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the given number");
		int num = sc.nextInt();
		faebo(num);
	}

}
