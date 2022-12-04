package com.programe.ArraySorting;

public class QuickInsertion {

	public static int partition(int[] arr, int fe, int le) {
		int start = fe;
		int end = le;
		int key = arr[fe];
		while (start < end) {
			while (arr[start] <= key) {
				start++;
			}
			while (arr[end] > key) {
				end--;
			}
			if (start < end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
		}
		int temp1 = arr[end];
		arr[end] = arr[fe];
		arr[fe] = temp1;
		return end;
	}

	public static void quickSort(int[] arr, int fe, int le) {
		if (fe < le) {
			int temp = partition(arr, fe, le);
			quickSort(arr, fe, temp - 1);
			quickSort(arr, temp + 1, le);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 5, 7, 29, 96, 32, 48, 1, 8 };
		int fe = 0;
		int le = arr.length - 1;

		quickSort(arr, fe, le);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
