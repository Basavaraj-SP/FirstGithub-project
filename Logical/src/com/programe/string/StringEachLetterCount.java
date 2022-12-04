package com.programe.string;

public class StringEachLetterCount {

	public static void isCount(char[] c) {
		int l = c.length;
		for (int i = 0; i < l; i++) {
			int count = 1;
			for (int j = i + 1; j < l; j++) {
				if (c[i] == c[j]) {
					count++;
					int k = j;// 5
					while (k < l - 1) {
						c[k] = c[k + 1];// 5 ==>6,6 ==>7
						k++;
					}
					l--;
					j--;

				}
			}
			System.out.println(c[i] + "  ==> " + count);

		}
	}

	public static void main(String[] args) {
		String n = "chaithra is good girl";
		char[] c = n.toCharArray();
		isCount(c);
	}

}
