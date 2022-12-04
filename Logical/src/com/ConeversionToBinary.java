package com;

import java.util.Scanner;

public class ConeversionToBinary {

	static String binary(int number, int base) {
		String qt = "";
		while (number > 0) {

			int remainder = number % base;

			if (remainder > 9) {
				qt = (char)(remainder + 55) + qt;
			}
			else {
				qt = remainder + qt;
			}
			number = number / base;
		}
		return qt;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		System.out.println("Enter the base");
		int base = sc.nextInt();
		String qt1 = binary(number, base);
		System.out.println("The binary form of the given number is: " + qt1);
	}

}
