package com.programe.Array;

import java.util.Scanner;

public class ArrayAccentureProb {

	public static int count(int[] num, int num1) {
		int count = 0;
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
			count++;
			if (sum >= num1) {
				break;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rats");
		int rat = sc.nextInt();
		System.out.println("Enter the number of units");
		int units = sc.nextInt();
		int food = rat * units;
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		System.out.println("Enter the array elements");
		int[] number = new int[size];
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}
		int res = count(number, food);
		System.out.println("The total count is " + res);

	}

}
