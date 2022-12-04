package com.programe.string;

public class StringWordReverse {

	public static void isReverse(char[] c) {
		String d = "";
		for (int i = c.length - 1; i >= 0; i--) {// chaithra is good girl
			int k = i;// 21
			while (i >= 0 && c[i] != ' ') {
				i--;
			}
			int j = i + 1;// 17
			while (j <= k && j < c.length) {
				d = d + c[j];
				j++;
			}
			d = d + " ";
		}

		System.out.println(d);
	}

	public static void main(String[] args) {
		String n = "Chaithra is good girl";
		char[] c = n.toCharArray();
		isReverse(c);

	}

}
