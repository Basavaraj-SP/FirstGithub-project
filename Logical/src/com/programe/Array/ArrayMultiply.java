package com.programe.Array;

public class ArrayMultiply {

	public static void main(String[] args) {
		String s = "a7b2c4d6";
		String result="";
		
		for (int i=0;i<s.length();i++)
		{
			int num=0;
			int temp=s.charAt(i+1)-48;
			
			System.out.println("char"+s.charAt(i+1));
			while(num<temp)  
			{
				result=result+s.charAt(i);
				num++;
				
			}
			i++;
		}
		
		System.out.println(result);
		
	}

}
