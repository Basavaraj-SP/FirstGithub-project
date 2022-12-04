package com.programe.string;
//IP : Chaithra is good girl

//OP   arhtiahC si  doog lrig

public class Reverse {
	public static void reverse(String name) {
		char[] c = name.toCharArray();
		String st = "";
		for (int i = 0; i < c.length; i++) {
			int k = i;
			while (i < c.length && c[i] != ' ') {
				i++;

			}
			int j = i - 1;
			while (j >= k && j < c.length) {
				st = st + c[j];
				j--;
			}
			st = st + " ";
		}
		System.out.println(st);
	}

	public static void main(String[] args) {
		reverse("Chaithra is good girl");
	}
}
