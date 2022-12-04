package com.programe.string;

public class CountChar {
	public static int name(String name) {
		System.out.println("STRING LENGTH   "+name.length());
		char [] ch= name.toCharArray();
		System.out.println("CHAR ARRAY LENGTH  "+ch.length);
		
		int count=0;
		for(int i=0;i<=ch.length;i++) {
			
			count++;
		}
		return count;

	}
	public static void main(String[] args) {
	String name="Basavaraj S P";
	int result=name(name);
	System.out.println("The count of the given string is "+result);
	
	}
}
