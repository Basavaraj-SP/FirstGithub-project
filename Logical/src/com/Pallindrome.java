package com;

public class Pallindrome {
	
	public static int rev(int n) {
		int temp=n;
		int res=0;
		while(temp>0) {//433,43,4
			int rem=temp%10;//433%10=3,43%10=3,4%10=4
			res=(res*10)+rem;//0+3=3,30+3=33,330+4=334
			temp=temp/10;//433/10=43,43/10=4,4/10=0
		}
		return res;
	} 

	public static void main(String[] args) {
		int num=10101;
		int ans=rev(num);
		if(ans==num) {
			System.out.println("Pallindrome");
		}
		else {
			System.out.println("Not a pallindrome");
		}
	}
}
