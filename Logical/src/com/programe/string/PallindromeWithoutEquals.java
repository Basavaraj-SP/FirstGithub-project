package com.programe.string;

import java.util.Scanner;

public class PallindromeWithoutEquals {
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		boolean isPallindrome = false;
		String s = sc.next();
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			s1 = s1 + c;
		}
		if (s1.length() == s.length()) {
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s.charAt(i)) {
					isPallindrome = false;
					break;
				} 
				else {
					isPallindrome = true;
				}
			}
		}
		if (isPallindrome == true) {
			System.out.println("The given string is pallindrome");
		} else {
			System.out.println("The given string not a pallindrome");
		}

	}
}
