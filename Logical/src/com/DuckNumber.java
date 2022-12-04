package com;
import java.util.Scanner;
public class DuckNumber {
	public static int duck(int num) {
		int rem = 0;
		while (num > 0) {
			rem = num % 10;
			if (rem == 0) {
				break;
			
			}
			num = num / 10;
		}
		return rem;
	}

	public static void res(int num) {
		int digit = duck(num);
		if (digit == 0) {
			System.out.println("The number is duck number");
		} else {
			System.out.println("The number is not a duck");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
				res(num);
	}

}
