package com.programe.ArraySorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 3, 1, 9, 0, 5 };

		for (int i = 0; i < arr.length - 1; i++) { // number of pass
			for (int j = 0; j < arr.length - 1; j++) // compare
			{
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}
		for (int i : arr) {
			System.out.print(i + " ");

		}
	}
}
