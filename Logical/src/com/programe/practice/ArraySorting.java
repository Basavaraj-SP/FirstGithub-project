package com.programe.practice;

public class ArraySorting {

	public static void main(String[] args) {

		int[] arr = {22,33,44,55,11};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i] + " ");
		}

	}

}
