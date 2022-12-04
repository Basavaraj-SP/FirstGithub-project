package com;

import java.util.Scanner;

public class Average {
	
	public static void average(int[] n)
	{int sum=0;
	int count=0;
		for(int i=0;i<n.length;i++) {
			sum=sum+n[i];
			count++;
		}System.out.println(sum);
		sum=sum/count;
		System.out.println(sum+" is the average");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("How many numbers you want to enter?");
int num=sc.nextInt();
System.out.println("Enter the numbers");
int[] numlist=new int[num];
for (int i=0;i<numlist.length;i++)
{
	numlist[i]=sc.nextInt();
}
average(numlist);

	}
}
