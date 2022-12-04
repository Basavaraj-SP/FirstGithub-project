package com.programe.practice;

public class HappyNumber {
	
	public static int happy(int num) {
		int sum=0;
		while(num>0) {
			int rem=num%10;//3,1
			sum=sum+(rem*rem);//10
			num=num/10;//1
		}
		return sum;
	}
	
	public static boolean isHappy(int num) {
		while(num>9) {
			num=happy(num);
		}
		return num==1 || num==7;
	}

	public static void main(String[] args) {
	//32
		//3*2+2*2=13==>1*1+3*3==10==>1*1+0*0=1
		int num=478;
		boolean res=isHappy(num);
		if(res) {
			System.out.println("Happy number");
		}
		else {
			System.out.println("Not Happy number");
		}
		
		
	}

}
