package com;

import java.util.Scanner;

public class StrongNumbers extends DsariumNumber {

	public static int factorial(int num1) {// 5 3
		int sum = 1;
		for (int i = 1; i <= num1; i++) {// 1,2
			sum = sum * i;//// 1*1=1,2*1
		}
		return sum;
	}

	public static int res(int num) {
		int temp = num;
		int fact = 0;
		while (temp > 0) {// 145
			int rem = temp % 10;// 145%10=5,14%10=4
			fact = fact + factorial(rem);
			temp = temp / 10;// 145/10==14,14/10==4
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int finalvalue = res(num);
		if (finalvalue == num) {
			System.out.println("The given number:" + num + " is strong number");
		} else {
			System.out.println("The given number:" + num + " is not strong number");
		}

	}

}
