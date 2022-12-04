package com;

public class BinaryToDeciaml {

	public static int power(int num, int count) { // 2 3

		int initial = 1;

		while (count > 0) {
			initial = (initial * 2); // 8
			count--;
		}

		return initial;
	}

	public static int result(int num) {

		int temp = num; // 1010
		int out = 0;
		int sum = 0;
		int c = 0;
		while (temp > 0) {
			int rem = temp % 10;
//			System.out.println("rem" + rem);
			out = rem * power(2, c);// 0*0
			sum = sum + out;
//			System.out.println("out" + out);
			// sum=sum+out;
			temp = temp / 10;
			c++;
		}

		return sum;
	}

	public static void main(String[] args) {
		int num = 1110;
		int res = result(num);
		System.out.println(res);
	}

}
