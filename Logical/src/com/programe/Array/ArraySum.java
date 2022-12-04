package com.programe.Array;

public class ArraySum {

	public static void main(String[] args) {
		int sum=0;
	int [] var= {1,4,6,2,3,5,8};
//	for (int i=0;i<var.length;i++) {
	for(int i =var.length-1;i>=0;i--) {
		System.out.println(var[i]);
		sum=sum+var[i];
	}
	System.out.println("Sum of the elements in the array is "+sum);		
	}

	}


