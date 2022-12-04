package com.programe.practice;

public class SumOfNatural {
	
	public static int natural(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
		return sum;
	}

	public static void main(String[] args) {
	int num=10;
	int res=natural(num);
	System.out.println("The sum of natural numbers upto "+num+" is "+res);
	}

}
