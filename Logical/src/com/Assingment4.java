package com;

public class Assingment4 {
	
	public static int count(int num) {
		int temp=num;
		int sum=0;
		while(temp>0) {
			int rem=temp%10;
			sum=sum+rem;
			temp=temp/10;
		}return sum;
	}
	
public static int sum(int n1, int n2,int n3){
	int party1=count(n1);
	int party2=count(n2);
	int party3=count(n3);
	if(party1>(party2+party3)) {
		System.out.println("party 1 has won the election");
	}
	else if(party1<(party2+party3)) {
		System.out.println("other party has won the election");
	}
	else {
		System.out.println("Both the parties have same votes");
	}
	return party1;
}


public static void main(String[] args) {
	int party1=7000;
	int party2=800;
	int party3=100;
	int res=sum(party1,party2,party3);	
}
}
