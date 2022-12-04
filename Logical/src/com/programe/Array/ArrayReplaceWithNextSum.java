package com.programe.Array;

public class ArrayReplaceWithNextSum {

	public static void main(String[] args) {

		int[] arr = { 7, 8, 2, 5, 7, 9, 10, 2 };
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i + 1; j < arr.length; j++) {
				sum = sum + arr[j];
				arr[i] = sum;
			}
			
			System.out.print(arr[i] + " ");
		}

	}

}
