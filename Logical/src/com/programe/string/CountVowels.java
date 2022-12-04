package com.programe.string;

public class CountVowels {
	public static void name(String name) {
		char[] ch = name.toCharArray();
		int count = 0;
		int count1 = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				count++;

			} else if (ch[i] != 'a' || ch[i] != 'e' || ch[i] != 'i' || ch[i] != 'o' || ch[i] != 'u') {
				count1++;
			}
		}
		System.out.println("The given string contains  " + count + "  no of vowels");
		System.out.println("The given string contains " + count1 + " no of consonents");

	}

	public static void main(String[] args) {
		String name = "Chaithra S Patil";
		name(name);

	}
}
