package com;

public class Assignment3 {
	public static int count(int num) {
		int temp = num;
		int count = 0;
		int n = 0;
		while (temp > 0) {
			int rem = temp % 10;
			if (rem == 9) {
				count++;
			}
			temp = temp / 10;
		}
		return count;
	}

	public static void main(String[] args) {
		int num = 8969949;
		int res = count(num);
		if (res >2) {
			System.out.println("The given number "+num+" is dummy number");
		} else {
			System.out.println("The given number  "+num+" is not a dummy number");
		}
	}
}
