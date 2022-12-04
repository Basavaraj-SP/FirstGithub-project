package com;
import java.util.Scanner;
public class LargestAmongN {
	public static int largest(int n[]) {
		int max=0;
		for(int i=0;i<n.length;i++) {
			
			if(n[i]>max)
			{
				max=n[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("How many numbers do you want to compare");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the numbers");
		int [] numbers=new int[n];
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=sc.nextInt();
		}
		int max=largest(numbers);
		System.out.println("Largest num is "+max);

	}

}
