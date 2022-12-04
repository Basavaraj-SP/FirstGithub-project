package com;

public class Power {

	public static int power(int base,int exp) {
		int temp=1;
		while(exp>0) {
			 temp=temp*base;
			exp--;
		}return temp;
	}
	public static void main(String[] args) {
		int res=power(3,3);
		System.out.println(res);

	}
 
}
