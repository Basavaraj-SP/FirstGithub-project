package com;

public class DecimalToBinary {
	public static void toBinary(int num) {
		String n1 = "";
		String rev = "";
		while (num > 0) {
			int rem = num % 2;
			n1 = rem + n1;
			num = num / 2;
		}
		System.out.println(n1);
	}

	public static void main(String[] args) {
		int num = 13;
		toBinary(num);

	}

}
