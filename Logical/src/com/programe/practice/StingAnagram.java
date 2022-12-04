package com.programe.practice;

public class StingAnagram {

	public static String isUpperacase(String c) {
		String sorted = "";
		for (int i = 0; i < c.length(); i++) {
			if (c.charAt(i) >= 'a' || c.charAt(i) <= 'z') {
				sorted = sorted + (char) (c.charAt(i) - 32);
			}
		}
		return sorted;
	}

	public static String isSort(char[] c) {
		char temp = '\0';
		String s = "";
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] > c[j]) {
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;

				}

			}
			s = s + c[i];
		}
		return s;
	}

	public static void main(String[] args) {
		String s = "gadag";
		String s1 = "dagag";

		if (s.length() == s1.length()) {
			char[] c = isUpperacase(s).toCharArray();
			char[] c1 = isUpperacase(s1).toCharArray();
			if (isSort(c).equals(isSort(c1))) {
				System.out.println("The given Strings are anagram");
			}
		} else {
			System.out.println("The given strings are not anagram");
		}

	}

}
