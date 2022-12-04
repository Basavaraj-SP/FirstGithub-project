package com.programe.string;

import java.util.Scanner;

public class StringReverse {


	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
				s1 = s1 + c;	
		}
		if (s1.equals(s)) {
			System.out.println("pallindrome");
		} else {
			System.out.println("not pallindrome");
		}
	}

}
