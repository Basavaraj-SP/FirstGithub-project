package com.programe.string;

public class Substring {
	public static boolean name(char[] c1, char[] c2) {
		for (int i = 0; i < c1.length; i++) {
			int k = i;
			for (int j = 0; j < c2.length; j++) {
				while (j < c2.length && k < c1.length && c2[j] == c1[i]) {
					k++;
					j++;
				}
				if (j == c2.length) {
					return true;
				}

			}

		}
		return false;

	}

	public static void main(String[] args) {
		String s1 = "chitradurga";
		String s2 = "durga";
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		boolean res = name(c1, c2);
		System.out.println(res);

	}

}
