package com.programe.practice;

public class ArrayZigZag {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 5, 6, 7, 8 };
		int size = (arr1.length + arr2.length);
		int[] arr3 = new int[size];// 1 5 2 6 3 7 4 8
		int i = 0;
		int j = 0;
		int m = 0;
		while (i < size) {
			if (i % 2 == 0) {
				arr3[i] = arr1[j];
				j++;
			} else {
				arr3[i] = arr2[m];
				m++;
			}
			i++;
		}
		for (int f = 0; f < arr3.length; f++) {
			System.out.print(arr3[f] + " ");
		}
	}

}
