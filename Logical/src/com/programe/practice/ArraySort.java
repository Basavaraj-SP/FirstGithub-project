package com.programe.practice;

public class ArraySort {

	public static void main(String[] args) {
		int num = 104578;
		int num1 = num;
		int count = 0;

		while (num > 0) {
			count++;
			num = num / 10;

		}
		int[] arr = new int[count];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = num1 % 10;
			num1 = num1 / 10;

		}
		int replace = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					replace = arr[i];
					arr[i] = arr[j];
					arr[j] = replace;
				}
				
			}
			System.out.print(arr[i]);
		}

	}

}
