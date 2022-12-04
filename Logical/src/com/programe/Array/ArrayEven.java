package com.programe.Array;

import java.util.Scanner;

public class ArrayEven {

	public static int even(int[] even) {
		int n = 0;
		int sum = 0;
		for (int i = 0; i < even.length; i++) {
			n = even[i];
			if (n % 2 == 0) {
				sum = sum + n;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] numbers = new int[size];
		System.out.println("Enter the numbers");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		int res = even(numbers);
		System.out.println("The sum of even numbers in the array is " + res);
	}

}
