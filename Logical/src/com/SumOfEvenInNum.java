package com;

public class SumOfEvenInNum {
	
	public static void count(int num) { 
		int sum=0;
	
			while(num>0) {//9474
				int rem=num%10;
				if(rem%2==0) {
				 sum=sum+rem;
				
				}
				num=num/10;//9474/10=947/94/9/0
			} System.out.println(sum);
	}
             

	public static void main(String[] args) {
		// TODO Auto-generated method stub
count(8481);
	}

}
