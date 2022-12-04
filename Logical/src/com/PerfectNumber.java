package com;

public class PerfectNumber {
public static int perfect(int num) {
	int sum=0;
	for(int i=1;i<num;i++) {
		if(num%i==0) {
			sum=sum+i;
		}
	}return sum;
}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=8128;
		int res=perfect(num);
		if(res==num) {
			System.out.println("The given number is a perfect number");
		}
		else {
			System.out.println("The given number is not a perfect number");
		}
			
		}
	}


