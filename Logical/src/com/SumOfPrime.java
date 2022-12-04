package com;

public class SumOfPrime {

	public static void prime(int num) {
		int count = 0, sum = 0, i = 1, prime = 0;
		while (i <= num) {
			if (num % 2 == 0) {
				count++;
				if (count == 2) {
					System.out.println(i);
				}
			}
			i++;
		}

	}

	public static void main(String[] args) {
		prime(6);
	}
}
