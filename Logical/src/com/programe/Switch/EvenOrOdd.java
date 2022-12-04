package com.programe.Switch;

public class EvenOrOdd {

	public static void main(String[] args) {
		int n = 1001;
		switch (n % 2) {
		case 0:
			System.out.println("Even");
			break;
		case 1:
			System.out.println("Odd");
			break;
		}
		System.out.println("=======================================================");
		String[] arr = { "even no", "odd no" };
		System.out.println(arr[n % 2]);
	}

}
