package com.programe.practice;

import java.util.Scanner;

public class StringOnlyRepeat {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	char[] arr1=s.toCharArray();
	char[] arr2=s.toCharArray();
	char e='\0';
	for(int i=0;i<arr1.length;i++) {
		int c=0;
		for(int j=0;j<arr2.length;j++) {
			if(arr1[i]==arr2[j]) {
				arr2[j]=e;
				c++;
			}
			
		}
		if(c>1) {
		System.out.println(arr1[i]);
			}
	}
	
	}

}
