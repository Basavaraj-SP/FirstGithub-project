package com.programe.Array;

public class ArrayPerfect {

	public static int perfect(int[] perfect) {
		int n1 = 0;
		int sum = 0;
		for (int i = 0; i < perfect.length; i++) {
			int n = perfect[i];
			for (int j = 1; j <=n; j++) {
				n1 = j * j;
				if (n == n1) {
					sum = sum + n;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] numbers = { 10, 25, 4, 9, 81 };
		int res = perfect(numbers);
		System.out.println("The sum of the perfect numbers in the array is " + res);
	}
}
