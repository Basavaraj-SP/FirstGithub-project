package com;

public class FactorialSum {
	public static int fact(int n) {
		int factorial=1;
//		for(int i=1;i<=n;i++) {
//			factorial=factorial*i;
//		
//		}return factorial;
		int i=1;
		while(i<=n) {
			factorial = factorial*i;
			i++;
		}return factorial;
	}
	

	public static void main(String[] args) {
		int sum=0;
		int n=6;
		int i=1;
//		for(int i=1;i<=n;i++) {
//			int fact=fact(i);
//			sum=sum+fact;
//			
//		}
//		System.out.println(sum);
		while(i<=n) {
			int fact1=fact(i);
			sum=sum+fact1;
			i++;
		}
	  System.out.println(sum);
	}

}
