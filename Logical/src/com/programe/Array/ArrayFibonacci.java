package com.programe.Array;

public class ArrayFibonacci {

	public static int fibo(int[] fibo) {
		int sum1 = 0;
		for (int i = 0; i < fibo.length; i++) {
			int n = fibo[i];
			int n1 = 0, n2 = 1, j = 1, sum = 0;
			while (j <= n) {
				sum = n1 + n2;
				n1 = n2;
				n2 = sum;
				j++;
				if (n == sum) {
					sum1 = sum1 + sum;
				}
			}
		}
		return sum1;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 5, 8, 13, 11, 10 };
		int res = fibo(numbers);
		System.out.println("The sum of fibonacci series is in array is " + res);

	}

}
