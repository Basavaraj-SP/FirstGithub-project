package com;

import java.util.Scanner;

public class DsariumNumber {
static int num;
static int count=0;

	public static  int count(int num) {
		while(num>0) 
		{
			num=num/10; //89 8
			count++;
		}
		System.out.println("count return"+count);
		return count;
	}
		
		
		public  static int power(int number, int count) {  //r c
			int initial=1;
			while(count>0) {
				initial=number*initial;  //8*8=16
				count--;
			}
			System.out.println("power return"+initial);
			return initial;
		}
		
		public static int value(int number) {
			int temp=number;
			int sum=0;
			int c=count(number);
			System.out.println("Temp value is"+temp);
			
			while(temp>0) {
				int rem=temp%10;  //9
				System.out.println("rem is"+rem);
				System.out.println("count is"+c);
				System.out.println("Temp value is"+temp);
				sum=sum+power(rem,c); //81
				System.out.println("Sum is"+sum);
				temp=temp/10;  //89/10=8
				System.out.println("temp is"+temp);
				c--;
				System.out.println("count decrement value"+c);
				
			}return sum;
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int res=value(num);
		if(res==num)
		{
			System.out.println("The given no: "+num+" is dsarium");
		}
		else
		{
		System.out.println("The given no: "+num+" is not dsarium");
		}
	}

}
