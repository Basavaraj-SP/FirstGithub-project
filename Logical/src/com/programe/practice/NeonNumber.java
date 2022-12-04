package com.programe.practice;

public class NeonNumber {
	
	public static int neon(int num) {
		int res=0;
		int sum=0;
		if(num>0) {
			res=num*num;
			while(res>0) {
				int rem=res%10;
				sum=sum+rem;
				res=res/10;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int num=9;
		int ans=neon(num);
		if(ans==num) {
			System.out.println("Neon number");
		}
		else {
			System.out.println("Not a Neon number");
		}

	}

}
