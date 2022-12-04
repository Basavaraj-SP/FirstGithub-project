package com.programe.string;

public class FindSpecialChar {
	public static boolean name(String name) {
		char [] ch= name.toCharArray();
		boolean result=false;
		for(int i=0;i<ch.length;i++) {
			char c=ch[i];
		
			if(c==' ') {
				result=true;
			}
			
		}
		System.out.println(result);
		return result;

	}
	public static void main(String[] args) {
	String name="Chaithra";
	boolean result=name(name);
	if(result)
	{
		System.out.println("String  contains special char");
		
	}
	else
	{
		System.out.println("String doesn't have special char");
	}
	}
}
