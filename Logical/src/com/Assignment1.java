package com;

import java.util.Scanner;

public class Assignment1 {

	public static int count(int num) {
		int c = 0;
		while (num > 0) {
			num = num / 10;
			c++;
		}
		return c;
	}

	public static int sum(int num) {
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		return sum;
	}

	public static boolean prime(int num) {
		int count = 0;
		int i = 1;
		while (i <= num) {
			if (num % i == 0) {
				count++;
			}
			i++;
		}
		if (count == 2) {
			return true;
		}
		return false;
	}

	public static void lucky(int num) {
		int digit = sum(num);
		boolean lucky = prime(digit);
		if (lucky == true) {
			System.out.println("The employee id: " + num + " is lucky and eligible for bonus");
		} else {
			System.out.println("The employee id: " + num + " is not lucky,better luck next time");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter employee id");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int digit = count(num);
		if (num < 0) {
			System.out.println("The employee id must be Non-negative number");
		} else if (digit >= 6) {
			lucky(num);
		} else {
			System.out.println("The employee id must have 6 digits");
		}
	}
}
