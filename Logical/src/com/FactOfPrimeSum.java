package com;

public class FactOfPrimeSum {
	
	public static int prime(int n) {
		int i=1,c=0;
		while(i<=n) {
			if(n%i==0) {
				c++;
			}
			i++;
		}
		if(c==2) {
		System.out.println(n+" is Prime");
		}return n;
		
	}

	public static void main(String[] args) {
	

	}

}
