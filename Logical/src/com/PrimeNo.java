package com;

public class PrimeNo {
	public static boolean prime(int n) {
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				c++;
			}
		}
		if (c == 2) {
			return true;
		} 
		else {
			return false;
		}

	}

	public static void main(String[] args) {

		int n = 20;
		int sum=0;
		for (int i = 1; i <= n; i++) {
			boolean ans = prime(i);
			if (ans == true) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
