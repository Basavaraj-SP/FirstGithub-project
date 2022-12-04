package com.programe.Switch;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		char c = sc.next().charAt(0);
		int num2 = sc.nextInt();
		switch (c) {
		case '+':
			System.out.println("Add: " + (num1 + num2));
			break;
		case '-':
			System.out.println("subtract: " + (num1 - num2));
			break;
		case '*':
			System.out.println("multiplication: " + (num1 * num2));
			break;
		case '/':
			System.out.println("division: " + (num1 / num2));
			break;
		case '%':
			System.out.println("Mod: " + (num1 % num2));
			break;
		default:
			System.out.println("Invalid Arithmetic Operator");
		}

	}

}
