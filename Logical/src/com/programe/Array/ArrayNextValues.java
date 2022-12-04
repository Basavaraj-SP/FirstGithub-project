package com.programe.Array;

public class ArrayNextValues {

	public static void main(String[] args) {
		int[] arr= {10,20,7,6};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				System.out.println(arr[i]+" "+arr[j]);
			}
		}

	}

}
