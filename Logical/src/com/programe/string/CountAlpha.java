package com.programe.string;
// chaITHra is* Good girl
public class CountAlpha {
 
	public static void count(String name) {
		char[] c=name.toCharArray();
		int c1=0;
		int c2=0;
		int c3=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]>='A' && c[i]<='Z') {
				c1++;
			}
			else if(c[i]>='a' && c[i]<='z') {
				c2++;
			}
			else {
				c3++;
			}
		}
		System.out.println("The given string contains "+c1+" number of upper case");
		System.out.println("The given string contains "+c2+" number of lower case");
		System.out.println("The given string contains "+c3+" number of special character");
	}
	
	public static void main(String[] args) {
		count("chaITHra is* Good girl");
	}
}
