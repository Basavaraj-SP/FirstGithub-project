package com.programe.string;

// Hi Hello Hai

public class ReplacingWithCaps {
	public static void name(String name) {
		char[] ch = name.toCharArray();
		int count = 00;
		String st = "";

		for (int i = 0; i < ch.length; i++) {
			if (i ==0 && ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char) (ch[i] - 32);
			}

			else if (i > 0 && ch[i] != ' ' && ch[i - 1] == ' ') {
				if (ch[i] >= 'a' && ch[i] <= 'z') {

					ch[i] = (char) (ch[i] - 32);

				}

			} 
			else {
				if (ch[i] >= 'A' && ch[i] <= 'Z') {
					ch[i] = (char) (ch[i] + 32);
				}

			}
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}

	public static void main(String[] args) {
		String name = "hI hello chaithra";
		name(name);

	}
 
}
