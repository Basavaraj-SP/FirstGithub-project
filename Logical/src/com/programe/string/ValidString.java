package com.programe.string;

public class ValidString {
	
	public static void isValid(String name) {
		boolean isA =false;
		boolean isE =false;
		boolean isI =false;
		boolean isO =false;
		boolean isU =false;
		for(int i=0;i<name.length();i++) {
			 
			 if(name.charAt(i)=='a' ) {
				 isA=true;
			 }
			 if(name.charAt(i)=='e' ) {
				 isE=true;
			 }
			 if(name.charAt(i)=='i' ) {
				 isI=true;
			 }
			 if(name.charAt(i)=='o' ) {
				 isO=true;
			 }
			 if(name.charAt(i)=='u' ) {
				 isU=true;
			 }
		}
		if(isA==true && isE==true && isI==true && isO==true &&isU==true) {
			System.out.println("valid string");
		}
		else {
			System.out.println("Not a valid string");
		}
	}

	public static void main(String[] args) {
		String name="aeiou";
		isValid(name);
	}

}
