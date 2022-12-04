package com.programe.string;

import java.util.Arrays;

public class Anagram {

	/*
	 * public static void count(String name1,String name2) { char []
	 * c=name1.toCharArray(); char[] d=name2.toCharArray(); int count1=0; int
	 * count2=0; for(int i=0;i<c.length;i++) { count1++; } for(int
	 * j=0;j<d.length;j++) { count2++; if(c[j]>='a' && c[j]<='z') { d[j]=
	 * (char)(d[j]-32); } } if(count1!=count2) {
	 * System.out.println(" It is not a anagram"); } }
	 */

	public static String toUpper(String name1) {
		char[] c = name1.toCharArray();
		String s = "";
		for (int i = 0; i < c.length; i++) {
			if (c[i] >= 'a' && c[i] <= 'z') {
				c[i] = (char) (c[i] - 32);
				s = s + c[i];
			} else {
				s = s + c[i];
			}
		}

		return s;
	}

	static boolean validateAnagram(char[] c1, char[] c2) {
		boolean validate = false;
		for (int i = 0; i < c1.length && i < c2.length; i++) {
			if (c1[i] != c2[i]) {
				validate = false;
			} else {
				validate = true;
			}
		}
		return validate;
	}

	static void printArray(char[] c1) {
		System.out.println("After Sort ");
		for (int i = 0; i < c1.length; i++) {

			System.out.print(c1[i]);
		}
	}

	// GOD
	public static void main(String[] args) {
		String s1 = "God";
		String s2 = "gdo";

		if (s1.length() != s2.length()) {
			System.out.println("Given strings are not anagram");

		} else {

			String uppers1 = toUpper(s1);

			String uppers2 = toUpper(s2);

			char[] ch1 = uppers1.toCharArray();
			char[] ch2 = uppers2.toCharArray();
			Arrays.sort(ch1);//
			Arrays.sort(ch2);//

			printArray(ch1);
			System.out.println();
			printArray(ch2);
			System.out.println();

			boolean validate = validateAnagram(ch1, ch2);
			if (validate) {
				System.out.println("Given strings are  anagram");
			} else {
				System.out.println("Given strings are not anagram");
			}
		}

	}

}
