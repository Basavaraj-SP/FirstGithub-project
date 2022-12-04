package com.programe.Array;

public class ArrayMax {

	public static int max(int[] num) {
		int max = num[0];// we cant initialize 0 as max bcz it doesn't works for negative numbers.
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] numbers = { -11, -12, -54, -1 };
		int res = max(numbers);
		System.out.println(res);
	}
}
