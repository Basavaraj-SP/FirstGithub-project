package com.programe.Array;

public class ArrayMin {
	
	public static int max(int[] num) {
		int min=num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int[] numbers = { 1000, 20, 840, 540, 710 };
		int res = max(numbers);
		System.out.println(res);
	}
}
