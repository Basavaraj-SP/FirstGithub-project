package com;

import java.util.Scanner;

public class Vowels {
	public static void vowel(char name) {
	
	if(name=='a' || name== 'e'|| name == 'i'|| name== 'o'|| name=='u' || name=='A' || name== 'E'|| name == 'I'|| name== 'O'|| name=='U')
	{
		System.out.println("Given char "+name+"  is" +"vowel");
	}
	else {
		System.out.println("Given char "+name+"  is" +" not vowel");
	}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the char");
char ch=sc.next().charAt(0);
vowel(ch);

	}

}
