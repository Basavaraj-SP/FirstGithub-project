package com;

import java.util.Scanner;

public class ClassProblems {
	public static int max(int[] n) {
		int max = n[0];
		int sum = 0;
		for (int i = 0; i < n.length; i++) {
			if (max < n[i]) {
				max = n[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int[] numbers = new int[size];
		System.out.println("Enter the numbers");
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != max(numbers)) {
				sum = sum + numbers[i];
			}
		}
		if (max(numbers) == sum) {
			System.out.println("Super group");
		} else {
			System.out.println("Not super group");
		}

	}
}
