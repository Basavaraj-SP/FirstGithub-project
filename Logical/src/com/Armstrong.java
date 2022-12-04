package com;


//1 TO 100 
import java.util.Scanner;

public class Armstrong {
	
	public static int count(int num) { 
	int count=0;
		while(num>0) {//9474
			num=num/10;//9474/10=947/94/9/0
			count++;
		}return count;
	}
	
	public static int power(int num,int count) {
		int firstvalue=1;
		while(count>0) {
			firstvalue=num*firstvalue;//4*1,4*4,4*4,4*4
			count--;
		}return firstvalue;
	}
	
	
	public static int res( int num) {
		int temp=num;//9474
		int sum=0;
		int c=count(num);  //
		while(temp>0) {//true,true  
			int rem=temp%10;//9474%10=4,947%10=7
			sum=sum+power(rem,c);// 
			temp=temp/10;//9474/10
		}return sum;
	}
	
	
public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int finalres=res(num);
	if(finalres==num) {
		System.out.println("The given no:"+finalres+" is amstrong");
	}
	else
	{
		System.out.println("The given no:"+finalres+" is not amstrong");
	}
}
}
