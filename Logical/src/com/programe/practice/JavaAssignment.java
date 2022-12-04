package com.programe.practice;

import java.util.*;

public class JavaAssignment {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(11);
		l.add(14);
		l.add(13);
		l.add(12);
		for (int i : l) {
			System.out.println(i);
		}
		System.out.println("-----------------");
		System.out.println("The largest element is " + Collections.max(l));
		System.out.println("-----------------");
		System.out.println("The smallest element is " + Collections.min(l));
		System.out.println("-----------------");
		for (int i : l) {

			if (i % 2 == 0) {
				System.out.println("The even number is: " + i);

			}

		}
		System.out.println("------------------");
		for (int i = 0; i < l.size(); i++) {

			if (l.get(i) % 2 != 0) {
				System.out.println("The odd number is: " + l.get(i));

			}

		}
		System.out.println("-----------------------------");

		for (int i = 0; i < l.size(); i++) {
			for (int j = i + 1; j < l.size(); j++) {
				if (l.get(i) > l.get(j)) {
					int temp = l.get(i);
					l.set(i, l.get(j));
					l.set(j, temp);
				}
			}
			System.out.println(l.get(i));

		}

	}
}
