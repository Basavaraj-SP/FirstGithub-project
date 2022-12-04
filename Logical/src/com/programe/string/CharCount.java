package com.programe.string;


//Chaithra8 is2 good4 girl4

public class CharCount {
	

	public static void count(String name) {
		char[] c = name.toCharArray();

		String s = " ";
		for (int i = 0; i < c.length; i++) {
			int count = 0;
			while (i < c.length && c[i] != ' ') {
				s = s + c[i];
				count++;
				i++;
			}
			s = s + count + " ";
		}
		System.out.print("output  :");
		System.out.println(s);
	}

	public static void main(String[] args) {
		
		count("Chaithra is not only good girl she is also excellent");
	}
}
