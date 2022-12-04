package com.programe.Array;

public class ArrayLeftPrime {
	public static int isPrime(int num) {
		int count = 0;
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int result = -1;

		int[] array = { 1, 3, 4, 5, 8, 13, 6 };

		for (int i = 0; i < array.length; i++) {
			int sum = 0;
			for (int j = 0; j < i; j++) {
				int res = isPrime(array[j]);
				if (res == 2) {
					sum = sum + array[j];
					result = sum;
				}

			}

			System.out.print(result + " ");
		}

	}
}