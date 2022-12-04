package com.programe.Array;

public class SumOfDuplictaesInArray {

	public static void main(String[] args) {
		int[] arr1 = { 10, 2, 3, 2, 76, 10, 3, 10 };
		int[] arr2 = { 10, 2, 3, 2, 76, 10, 3, 10 };
		int sum = 0;

		for (int i = 0; i < arr1.length; i++) {
			int count = 0;
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					count++;
					arr2[j] = 0;

				}
			}
			if (count > 1) {
				sum = sum + arr1[i];
			}
		}
		System.out.println(sum);

	}

}
