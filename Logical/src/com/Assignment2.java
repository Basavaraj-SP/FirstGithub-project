package com;

public class Assignment2 {
	
	public static int odd(int num) {
		int n=0;
	if(num%2!=0) {
		 n=num;
	}
	return n;
	}
	public static int prime(int num) {
		int c=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				c++;
			}
		}
		return c;
	}
	
	public static int sum(int num) {
		int temp=num;
		int sum=0;
		while(temp>0) {
			int rem=temp%10;
			int res=odd(rem);
			sum=sum+res;
			temp=temp/10;	
		}
		return sum;
	}

	public static void main(String[] args) {
		int num=11182;
		int result=sum(num);
		int special=prime(result);
		if(special==2) {
			System.out.println("The given no is special number");
		}
		else {
			System.out.println("The given no is not a special number");
		}
	}

}
