package com.programe.string;

import java.util.Scanner;

public class SpecialString {
	public static void name(char[] c) {
		String res = "";

		for (int i = 0; i < c.length; i++) {
			if ((c[i] >= 'a' && c[i] <= 'z') || (c[i] >= 'A' && c[i] <= 'Z') || (c[i] == ' ')
					|| (c[i] >= 0 && c[i] <= 9)) {
				res = res + c[i];
			}
		}
		System.out.println(res);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		name(c);
	}

}
