package com.programe.practice;

public class CharCountInjava {

	public static void main(String[] args) {
		String s="chaithra is good girl";
		char[] c=s.toCharArray();
		char[] d=s.toCharArray();
		char temp='\0';
		for(int i=0;i<c.length;i++) {
			int count=0;
			for(int j=0;j<d.length;j++) {
				if(c[i]==d[j]) {
					d[j]=temp;
					count++;
				}
			}
			if(count>0) {
				System.out.println(c[i]+" "+count);
			}
		}
	}

}
