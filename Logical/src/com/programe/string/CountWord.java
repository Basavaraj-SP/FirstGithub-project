package com.programe.string;

public class CountWord {
	public static int name(String name) {
		char[] c = name.toCharArray();
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			if ((i == 0 && c[i] != ' ') || (c[i] != ' ' && c[i - 1] == ' ')) {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		String name = "chaithra s  patil ";
		int res = name(name);
		System.out.println(res);

	}

}
