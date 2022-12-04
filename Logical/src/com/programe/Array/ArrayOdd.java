package com.programe.Array;

public class ArrayOdd {
	public static int even(int[] even) {
		int n = 0;
		int sum = 0;
		for (int i = 0; i < even.length; i++) {
			n = even[i];
			if (n % 2 != 0) {
				sum = sum + n;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] numbers = { 10, 20, 15, 45, 85, 96 };
		int res = even(numbers);
		System.out.println("The sum of odd numbers in the array is " + res);
	}

}
