package com.programe.Array;

public class ArrayReplaceWithGreatestValue {
	public static void main(String[] args) {
//		int[] arr = { 7, 18, 2, 5, 4, 9, 12, 2 };
		int[] arr = { 12, 36, 89, 11, 62, 78, 99, 7, 16 };
		for (int i = 0; i < arr.length - 1; i++) {
			int s = -1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					s = arr[j];
					break;
				}
			}
			arr[i] = s;
			System.out.print(arr[i] + " ");

		}

	}

}
