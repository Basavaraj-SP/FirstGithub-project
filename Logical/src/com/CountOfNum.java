package com;

public class CountOfNum {
	public static int count(int num) { 
		int count=0;
			while(num>0) {//9474
				num=num/10;//9474/10=947/94/9/0
				count++;
			}return count;
		}
	
	
	
	
	public static void main(String[] args) {

int res=count(58797);
System.out.println(res);
	}
	}

