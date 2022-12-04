package com.programe.string;

public class ReplaceSpace {

	public static void replace(String name) {
		char []c=name.toCharArray();
		String s="";
		for(int i=0;i<c.length;i++) {  
			
			
			if((i==0 && c[i]!=' ')|| (c[i]!=' ') || (i>0 && c[i-1]!=' ' )){
				s=s+c[i];
			}		
		}System.out.println(s);
	}
	
	
	
	public static void main(String[] args) {
		replace("       Chaithtra   S    Patil");

	}

}
//1.space don't
//2.not equal 