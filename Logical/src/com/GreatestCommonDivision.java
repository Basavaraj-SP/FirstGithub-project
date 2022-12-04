package com;

import java.util.Scanner;

public class GreatestCommonDivision {
	/*
	 * public static void greatest(int num1, int num2) { int res1 = 0; for (int i =
	 * 1; i < num1; i++) {
	 * 
	 * for (int j = 1; j < num2; j++) { if (num2 % j == 0 && num1 % i == 0)
	 * 
	 * if(i==j) { res1=i; } } } System.out.println(res1);
	 * 
	 * 
	 * }
	 */
	public static void greatest(int num1, int num2) {
		int gcd = 0;
		int max=0;
		for (int i = 1; i <= num1 && i <=num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		System.out.println("GCD is  " + gcd);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:"); // 18 24 =6
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		greatest(num1, num2);
	}

}
