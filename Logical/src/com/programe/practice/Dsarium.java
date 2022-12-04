package com.programe.practice;

public class Dsarium {
	
	public static int count(int num) {
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		return count;
	}
	
	public static int power(int num,int num1) {
		int initial=1;
		while(num1>0) {
			initial=initial*num;
			num1--;
		}
		return initial;
	}
	
	public static int res(int num) {
		int c=count(num);
		int temp=num;
		int sum=0;
		while(temp>0) {
			int rem=temp%10;
			sum=sum+power(rem,c);
			temp=temp/10;
			c--;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		int num=135;
		int result=res(num);
		if(result==num) {
			System.out.println("Dsarium");
		}
		else {
			System.out.println("Not a Dsarium");
		}

	}

}
