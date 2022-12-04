package com.programe.practice;

public class MaxUsingTern {

	public static void main(String[] args) {
		int a = 60;
		int b = 900;
		int c = 800;
		System.out.println(a > b ? a > c ? a : c : b > c ? b : c);

	}

}
