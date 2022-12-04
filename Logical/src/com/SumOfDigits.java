package com;

public class SumOfDigits {

	public static int count(int num) { 
		int count=0;
		int sum=0;
			while(num>0) {//9474
				int rem=num%10;
				sum=sum+rem;
				num=num/10;//9474/10=947/94/9/0
			}return sum;
	}
	
	
	
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int res=count(8753);
		System.out.println(res);

			
	}

}
