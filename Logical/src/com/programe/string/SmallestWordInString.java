package com.programe.string;

public class SmallestWordInString {
	

	public static void main(String[] args) {
		String s="chaithra and diyaan";
		String word="";
		String [] name=new String[100];
		int l=0;
		s=s+" ";
		for(int i=0;i<s.length();i++) {//
			if(s.charAt(i)!=' ' ) {//01234567 91011 131415
				word=word+s.charAt(i);
			}
	
			else {
				name[l]=word;
				l++;
				word="";
			}
			
		}
		String Small="";
		String Large="";
		Small=Large=name[0];
		for(int i=0;i<l;i++) {
			if(Small.length()>name[i].length()) {//
				Small=name[i];
			}
			if(Large.length()<name[i].length()) {
				Large=name[i];
			}
			
		}
		System.out.println("The smallest word is: "+Small);
		System.out.println("The largest word is: "+Large);
	}

}
