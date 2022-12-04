package com.programe.practice;

public class Numbers {

	public static void main(String[] args) {
		String output=" ";
		int choice=0;
		int num=3412;
		while(num>0) {
		
			int rem=num%10;
			choice=rem;
			num=num/10;
			
		switch(choice) {
		case 1:output="ONE"+" "+output;
		break;
		case 2:output="TWO"+" "+output;
		break;
		case 3: output="THREE"+" "+output;
		break;
		case 4:output="FOUR"+" "+output;
		break;
		}
		}
		System.out.println(output);

	}

}
