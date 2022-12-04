package com;

import java.util.Scanner;

public class LaregstAmonThree {

	public static void great(int n1, int n2, int n3) {
		if (n1 >=n2 && n1 >= n3) {
			System.out.println(n1 + " is greatest ");

		}

		else if (n2 >=n3 && n2 >=n1) {
			System.out.println(n2 + " is the greatest");
		} else {
			System.out.println(n3 + " is the greatest");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		great(n1, n2, n3);
	}

}
