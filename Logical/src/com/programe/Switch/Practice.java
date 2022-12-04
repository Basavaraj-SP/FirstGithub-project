package com.programe.Switch;

public class Practice {

	public static void toBinary(int num) {
		int temp = num;
		String n = "200";
		String res = "";
		while (num > 0) {
			int rem = num % 16;
			if (rem > 9) {
				res = (char) (rem + 55) + (res);
			} else {
				res = rem + res;
			}
			num = num / 16;
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		int num = 65535;
		toBinary(num);
	}

}
