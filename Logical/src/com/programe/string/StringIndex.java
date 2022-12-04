package com.programe.string;

import java.util.Scanner;

public class StringIndex {

	public static void findIndex(String s, char c) {
		int num = 0;
		for (int i = 0; i < s.length(); i++) {
			if (c == s.charAt(i)) {
				num = isPrime(i);
				break;
			}
		}
		if (num == 2) {
			System.out.println("The given char " + c + " is Unique element");
		} else {
			System.out.println("The given char " + c + " is not Unique element");
		}
	}

	public static int isPrime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return 2;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		System.out.println("Enter the char");
		char c = sc.next().charAt(0);
		findIndex(s, c);
	}

}
