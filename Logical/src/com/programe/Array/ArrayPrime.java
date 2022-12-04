package com.programe.Array;

public class ArrayPrime {

	public static int sum(int[] num) {
		int sum=0;
		int n=0;
		int n1=0;
		for(int i=0;i<num.length;i++) {
			n1=num[i];
			n=prime(n1);
		if(n==2) {
			sum=sum+n1;
		}
		}
		return sum;
	}
	
	public static int prime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		return count;
	}

	
	public static void main(String[] args) {
		int[] numbers = { 2, 3, 5, 7, 11,56,46,54,13};
		int res = sum(numbers);
		System.out.println("The sum of prime numbers in the array is " + res);

	}


}
