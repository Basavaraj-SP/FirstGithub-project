package com.programe.string;

public class SwappingTwoStrings {

	public static void main(String[] args) {
		String name1="Chaithra";
		String name2="diyaan";
		System.out.println("name1 is ==>"+name1);
		System.out.println("name2 is ==>"+name2);
		name1=name1+name2;//14,Chaithradiyaan
		name2=name1.substring(0, name1.length()-name2.length());//0,8==>Chaithra
		name1=name1.substring(name2.length());//8,diyaan
		System.out.println("After");
		System.out.println("name1 is ==>"+name1);
		System.out.println("name2 is ==>"+name2);

	}

}
